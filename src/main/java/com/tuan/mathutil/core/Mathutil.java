/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.tuan.mathutil.core;

/**
 *
 * @author Admin
 */
public class Mathutil {
public static long getFactorial(int n){
        if( n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n - 1); // de quy
    }
}
