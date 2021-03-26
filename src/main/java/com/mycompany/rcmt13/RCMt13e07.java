/*
Añadir a la función anterior un parámetro de texto de ayuda, para saber lo que tiene que 
introducir el usuario. Así nos evitamos el System.out.print previo a las lecturas de teclado. Ejemplo: 
int edad = leerEntero (“Introduzca su edad”, 0, 120);

Fecha: 26/03/2021
Alumno: Rafael Chamorro Maceiras
 */
package com.mycompany.rcmt13;

import java.util.Scanner;


public class RCMt13e07 {
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
                    String texto = String.format("Introduzca un numero entre %d y %d:",min,max);
                    int num = leerEntero(texto,max,min);
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
     * @param texto Tipo String. Mensaje para el usuario.
     * @param max Tipo int. Valor máximo a introducir
     * @param min Tipo int. Valor mínimo a introducir
     * @return Devuelve un entero entre un maximo y un mímino
     * @since 26/03/2021
     */
    
    static int leerEntero(String texto, int max, int min) {
    	boolean salir = false;
        int num = 0;
    	do{
    		      System.out.println(texto);
                try{
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
