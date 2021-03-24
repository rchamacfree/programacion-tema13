/*
 Haz un programa que solicite al usuario dos números double y los intente sumar. En caso de 
que se introduzcan valores que no son enteros, por ejemplo, textos no numéricos, no provocará un 
error en tiempo de ejecución, simplemente informará de que se ha producido un error y no mostrará 
el resultado de la suma. 

Fecha: 22/03/2021
Alumno: Rafael Chamorro Maceiras
 */
package com.mycompany.rcmt13;

import java.util.Scanner;
public class RCMt13e02 {

    static Scanner teclado;
        
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        double num1, num2, res;
        int opcion;
        do{
            try {
                System.out.println("Introduce num1:");
                num1 = Double.parseDouble(teclado.nextLine());
                System.out.println("Introduce num2:");
                num2 = Double.parseDouble(teclado.nextLine());
                res = num1 + num2;
                System.out.println("res: "+ res);
            }catch (NumberFormatException ex){
                System.out.println(ex.toString());
            }
         
        
            System.out.println("0. salir / 1. Sumar");
            opcion = Integer.parseInt(teclado.nextLine());
        }while (opcion!=0);
        
    }
    
}
