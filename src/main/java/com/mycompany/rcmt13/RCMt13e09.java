/*
Modificar la clase MasterMind2 entregada por el profesor llamándola MasterMind3, para que
si el número ingresado por el usuario (cada intento) no cumple alguno de los requisitos, genere una
excepción. Habrá una excepción “Tamaño incorrecto” si no tiene 4 posiciones, “Valores inválidos” si
tiene caracteres no numéricos y una tercera excepción “Valores repetidos” si contiene algún dígito
repetido.
Ejecuta el programa entregado por el profesor, que hace uso de esta clase, y provoca las excepciones
propuestas para ver su funcionamiento. A continuación, modifícalo para que capture estas
excepciones sin producir una salida abrupta del programa. 
fecha: 29/03/2021
Alumno: Rafael Chamorro Maceiras
 */
package com.mycompany.rcmt13;
import java.util.Scanner;
/**
 *
 * @author rchamac
 */
public class RCMt13e09 {

public static void main(String[] args) {
    
	  Scanner teclado= new Scanner(System.in);
      boolean fin=false; 
	  ResultadoMasterMind r =new ResultadoMasterMind();
      MasterMind3 juego = new MasterMind3();
      System.out.println ("["+juego.secreto+"]");
      
	  while (!fin) {
        System.out.printf("Introduce intento %d: ",juego.numIntento+1);
        try{
        String intento = teclado.nextLine();
        r = juego.comprobar(intento);
         if (r.bienColocados == -1) System.out.println ("Intento incorrecto");
        else {
          juego.pintarConsola();
        }
        }catch(ExceptionTamano e){
            System.out.println(e.getMessage());
        }catch(ExceptionInvalidos e){
            System.out.println(e.getMessage());
        }catch(ExceptionRepetidos e){
            System.out.println(e.getMessage());
        }
        if (r.bienColocados == -1) System.out.println ("Intento incorrecto");
        else {
          juego.pintarConsola();
        }
        if (r.gano || r.sinMasTurnos) fin=true; 
     }
     if (r.gano) System.out.println ("Enhorabuena. Acertaste.");
     else System.out.println ("Lo sentimos. Era el "+juego.secreto);
    } //main
} //clase