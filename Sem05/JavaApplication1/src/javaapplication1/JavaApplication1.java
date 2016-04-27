/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    double A,B;
    double R;
    
    System.out.println("Introduce el primer número:");			
    A = reader.nextInt();
 
    System.out.println("Introduce el segundo número:");
    B = reader.nextInt();
  
    R = A+B;
    
    System.out.println("La suma es " +R);
  }
  
}
