package javaapplication1;

import java.util.Scanner;

public class NewMain {

  public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in); //Creación de un objeto Scanner    
    //DECLARACION DE VARIABLES
        int A,B;
        double R;
    //LECTURA DE DATOS
        System.out.println ("Por favor introduzca una cadena por teclado:");
        A = entrada.nextInt(); 
        System.out.println ("Por favor introduzca una cadena por teclado:");
        B = entrada.nextInt(); 
    //PROCESO
        R=A+B;
    //SALIDA DE DATOS
        System.out.println ("Entrada recibida por teclado es: " + R);
  }
  
}
