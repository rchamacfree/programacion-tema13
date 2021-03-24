/*
Haz un programa que solicite al usuario dos números enteros y los intente dividir (división 
entera, sin decimales). Si se produce algún error el programa no finalizará de forma abrupta si no 
que capturará la excepción ocurrida: o bien entrada de valores incorrectos o bien por división por 
cero, informando al usuario de lo que ha acontecido. Finalmente, mostrará el resultado de la división,
que será cero en caso de cualquiera de los dos errores posibles.

Fecha: 22/03/2021
Alumno: Rafael Chamorro Maceiras
 */
package com.mycompany.rcmt13;

import java.util.Scanner;



public class RCMt13e03 {
    static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int num1, num2, res=0;
        
        try{
            System.out.println("Introduce num1:");
            num1 = Integer.parseInt(teclado.nextLine());
            System.out.println("Introduce num2:");
            num2 = Integer.parseInt(teclado.nextLine());
            
            res = num1/num2;
            
        }catch (NumberFormatException ex){
            System.out.println(ex.toString());
            res = 0;
            
        }catch (ArithmeticException ex){
            System.out.println(ex.toString());
            res = 0;
            
        }finally{
            System.out.println("resultado = "+res);
        }




    }
    
}
