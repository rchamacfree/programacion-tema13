/*
Realiza una función/método que se le pase por parámetro una cadena que representa una 
dirección de correo electrónico. En caso de que la cadena no cumpla las condiciones sintácticas de 
un email, se generará una excepción de tipo: “Formato email inválido”. Los requisitos que tiene que 
tener una dirección de email podrían ser: número mínimo de caracteres=5, una arroba y al menos 
un punto después de la arroba. Hacer también un programa que llame a la función anterior y capture 
la excepción generada. 

Fecha: 26/03/2021
Alumno: Rafael Chamorro Maceiras
 */
package com.mycompany.rcmt13;

import java.util.Scanner;

/**
 *  
 * @author rchamac
 */
public class RCMt13e08 {
    static Scanner teclado;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
		teclado = new Scanner(System.in);
		String mail;
                boolean validar=false;
		System.out.println("introduce email");
		mail = teclado.nextLine();
  
                try{
                validar = validarEmail(mail);   
                }catch (ExceptionMail e){
                    System.out.println(e.toString());
                }
        if(validar)System.out.println("Formato email correcto");
    }//end main
    
        static boolean validarEmail(String x)throws ExceptionMail{
        boolean validar;
        if (x.length()<5) validar = false;
        else if (x.indexOf("@")==-1) validar = false;
        else if (x.indexOf(".",x.indexOf("@"))==-1) validar = false;
        else validar = true;
        
        if (!validar) {throw new ExceptionMail();}
        else return validar;
   }//end function

    
}//end class RCMt13e08


class ExceptionMail extends Exception{
        //usamos constructor por defecto
        public String getMessage(){
                return "Error: El formato no coincide con un Email válido";
        }
}//end class ExceptionMail
