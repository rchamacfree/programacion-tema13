/*
Crear una función leerEntero(int max, int min) que solicite al usuario la entrada de un número 
entero y que valide que es un valor entero y que está comprendido entre los parámetros max y min 
(esto es, mayor o igual que min y menor o igual que max). El usuario deberá repetir la entrada de 
datos hasta que lo haga bien, devolviendo finalmente la función el valor introducido y validado. La 
función controlará las posibles excepciones (por ejemplo caracteres no numéricos).

Fecha: 26/03/2021
Alumno: Rafael Chamorro Maceiras
 */
package com.mycompany.rcmt13;

import java.util.Scanner;


public class RCMt13e06 {
    static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int max=0, min=0;
                try{
                    System.out.println("introduce min");
                    min = Integer.parseInt(teclado.nextLine());
                    do{
                    System.out.println("introduce max");
                    max = Integer.parseInt(teclado.nextLine());
                    //comprobamos que el maximo sea mayor que el mínimo
                    }while(max<=min);
                    
                    int num = leerEntero(max,min);
                    System.out.println("número recibido: " + num);
                }catch(NumberFormatException e){
                    System.out.println(e.toString());
                }
                
    }//fin main
    /**
     * Metoro leerEntero 
     * Solicita al usuario que introduzca un número entre un máximo y un mínimo
     * @author Rafael Chamorro
     * @version 1.0
     * @param max Tipo int. Valor máximo a introducir
     * @param min Tipo int. Valor mínimo a introducir
     * @return Devuelve un entero entre un maximo y un mímino
     * @since 26/03/2021
     */
    
    static int leerEntero(int max, int min) {
    	boolean salir = false;
        int num = 0;
    	do{
    		try{
                        System.out.printf("introduce número entero entre %d y %d: %n",min,max);
                        int numero = Integer.parseInt(teclado.nextLine());
                        if (numero >= min && numero <= max){num = numero ;salir = true;}
    		}catch (NumberFormatException e){
    			System.out.println(e.toString());
                        System.out.println("Has introducido un tipo no entero.");
    		}
    	
    	}while (!salir);
        return num;
    }//fin funcion   
    
}
