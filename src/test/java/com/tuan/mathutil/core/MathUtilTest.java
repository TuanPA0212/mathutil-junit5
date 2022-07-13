/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tuan.mathutil.core;

import static com.tuan.mathutil.core.Mathutil.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


/**
 *
 * @author Admin
 */
public class MathUtilTest {
    
    //dùng DDT, tách data ra khỏi câu lệnh kiểm thử, tham số hóa data này
    //vào trong câu lệnh kiểm thử
    
    //cb bộ data
    public static Object[][] initData(){
        return new Integer[][]{
                            {1, 1},
                            {2, 2},
                            {5, 120},
                            {6, 720}
        };
    }

      @ParameterizedTest
    @MethodSource(value = "initData") //tên hàm cung cấp data, ngầm định thứ tự
      //của các phần tử mảng, map vào tham số hàm
   public void testGetFactotialGivenRightArgReturnWell(int input, long expected){
            assertEquals(expected, getFactorial(input));
   }
    
//   @Test
//   public void testGetFactotialGivenRightArgReturnWell(){
//            assertEquals(120, getFactorial(5));
//   }
    
   //Bắt ngoại lệ khi đưa data cà chớn
   @Test
   public void testGetFactotialGivenWrongArgThrowException(){
       //xài biểu thức Lambda
       //hàm nhận tham số thứ 2 là 1 cái object/ có code implement cái
       //functional interface tên là Executale - có 1 hàm duy nhất k có code 
       //tên là execute()
      
       //chơi chậm 
//       Executable exObject = new Executable() { 
//           @Override
//           public void execute() throws Throwable {
//               getFactorial(-5);
//           }
//       };

//        Executable exOject = () -> getFactorial(-5);

       assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
   }
}
 