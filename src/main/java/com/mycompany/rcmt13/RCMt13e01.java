/*
 Haz un programa que solicite al usuario dos números enteros y los intente dividir (división 
entera, sin decimales). Si el denominador es cero, deberá capturar la excepción y decir que el 
resultado de la división es cero, sin que el programa pare su ejecución abruptamente. 
Nota: para provocar la excepción, hacemos la división de enteros, sin casting: double 
res=num1 /num2; con num2=0. Si hiciésemos el casting: double res = (double) num1 / num2; 
no se produce la excepción, informa que el resultado es ‘Infinity’

Fecha: 22/03/2021
Alumno: Rafael Chamorro Maceiras
 */
package com.mycompany.rcmt13;

import java.util.Scanner;

public class RCMt13e01 {

    static Scanner teclado;

    public static void main(String[] args) {

        teclado = new Scanner(System.in);
        int num1, num2;
        double res = 0;
        System.out.println("Introduce num1: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce num2: ");
        num2 = teclado.nextInt();

        try {
            res = num1 / num2;
            System.out.println("Resulado: " + res);
        } catch (ArithmeticException ex) {
            res = 0;
        } finally {
            System.out.println("Resultado: " + res);
        }

    }

}
