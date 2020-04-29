/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author DELL
 */
public class MyToys {
    public static long computeFibonaci(int n) {
        int resultB = 1;
        int resultA = 1;
        int result = 0;
        if(n < 0) {
            throw new IllegalArgumentException("n must be greater or equal 0");
        }
        else if(n == 0) {
            return (result = 1);
        }
        else {
            for (int i = 0; i < n; i++) {                  
                result =  resultA + resultB;
                resultB = resultA;
                resultA = result;
            }
        }
        return result;
    }
}
