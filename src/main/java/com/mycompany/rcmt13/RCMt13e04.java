/*
Haz un programa que tenga definido un Array de 7 posiciones de double que representa la 
temperatura media en una ciudad durante una semana (puedes generar valores al azar entre 0 y 40 
para llenarlo). Se le solicitará al usuario que introduzca dos posiciones, y calculará la temperatura 
media entre esos días del año. Si los valores introducidos no son válidos, por estar fuera de los límites 
del array se capturará la excepción y la media será cero. 

fecha: 24/03/2021
Alumno Rafael Chamorro Maceiras
 */
package com.mycompany.rcmt13;

import java.util.Random;
import java.util.Scanner;

public class RCMt13e04 {
    static Scanner teclado;
    

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        double [] temp = new double[7];
        Random r = new Random();
        float res=0;
        char exit;
        boolean salir = false;
        
        
        //Llenamos el array con valores al azar
        for (int i = 0; i<temp.length;i++){
            temp[i]= r.nextInt(41);
            System.out.println(i + " " + temp[i]);
        }
        
        do{ //do...while para controlar la salida del programa
        System.out.println("Introduce posiciones para hallar la media:");
        try{
        System.out.println("Posicion 1: ");
        int pos1 = Integer.parseInt(teclado.nextLine());
        double valor1 = temp[pos1];
        System.out.println("Posicion 2: ");
        int pos2 = Integer.parseInt(teclado.nextLine());
        double valor2 = temp[pos2];
        res = ((float)valor1+(float)valor2)/2f;
        
        //con este catch comprobamos que el valor introducido en una posición valida del array
        }catch (ArrayIndexOutOfBoundsException e){
          System.out.println(e.toString());
          res = 0; 
         
        //con este catch comprobamos que no se introduce un formato incorrecto en el campo. (p.e. un String)
        }catch(NumberFormatException e){
            System.out.println(e.toString());
            res = 0;
        }finally{
        System.out.println("Resusltado =  "+ res);
        }
        
        
            System.out.println("realizar otro cálculo? (y/n)");
            exit = teclado.nextLine().charAt(0);
            if (exit == 'n' || exit == 'N')salir = true;
            else salir = false;
            
        }while(!salir);
        
    }
    
}
