/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1427test;

import data.MyToys;
public class SE1427Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Fibonaci with number n :");
        System.out.println("2 = " + MyToys.computeFibonaci(2));
        System.out.println("3 = " + MyToys.computeFibonaci(3));
        System.out.println("4 = " + MyToys.computeFibonaci(4));
        System.out.println("-3 = " + MyToys.computeFibonaci(-3));
    }
    
}
