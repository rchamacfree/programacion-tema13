/*
Haz un programa que, desde el main(), solicite al usuario que introduzca tres enteros, 
correspondientes a día, mes y año de una fecha. Realiza una función llamada validarFecha() que 
reciba esos tres valores e intentar construir una fecha con LocalDate.of devolviendo true si la fecha 
es válida o false si la fecha es inválida, es decir si se produce una excepción al construirla. 
• En caso de que los valores introducidos no sean enteros, el main() avisará de tal situación 
capturando la excepción en tipos de datos incorrectos al hacer el nextInt(). 
• Si la función no es capaz de crear la fecha porque los valores no se corresponden con valores 
válidos, capturará esa excepción. Así pues, habrá un try…catch en el main() y otro en la 
función.

Fecha:
Alumno: Rafael Chamorro Maceiras
 */
package com.mycompany.rcmt13;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RCMt13e05 {
    static Scanner teclado;
    public static void main(String[] args) {
        
        teclado = new Scanner(System.in);
        int dia=0,mes=0,año=0;
        boolean fechacorrecta;
        try{
        System.out.println("Introduce día:");
        dia = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce mes:");
        mes = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce año:");
        año = Integer.parseInt(teclado.nextLine());
        fechacorrecta = validarFecha(dia,mes,año);
        if (fechacorrecta)System.out.println("Fecha válidada!!!!");
        else System.out.println("Fecha no válida!!!");

        }catch(NumberFormatException e){
            System.out.println("Tipo de datos incorrecto;");
            System.out.println(e.toString());
        }
    }//fin main
    
    static boolean validarFecha(int d, int m, int a){
        
        String aux = String.format("%04d-%02d-%02d",a,m,d);
        try{
        LocalDate fecha = LocalDate.parse(aux);
        }catch(DateTimeParseException e){
            System.out.println(e.toString());
            return false;
        }
          
      return true;  
    }
    

}

    