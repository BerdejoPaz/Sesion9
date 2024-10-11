package Programas;
/**
 Crear un programa en Java que permita almacenar en un arreglo de datos cinco números 
 ingresados y realizar una búsqueda mediante un número ingresado. 
 Visualizar un mensaje indicando si el número existe o no existe. 
Ejemplo:
A[5]=10 20 30 40 50
nbus=30
Resultado:
mensaje=”Si existe el número”

 */
import java.util.Scanner;
public class Programa2 {
     public static void main(String args[] ) {
     //declarar Variables
     int numero,nbus;
     Scanner lectura=new Scanner(System.in);
     int [ ] anumeros=new int[5];
     String mensaje=" ";
     //entrada de datos
    for (int i = 0; i < anumeros.length; i++) {
                System.out.print("Ingresar numero "+(i+1)+":");
                numero=lectura.nextInt();
                anumeros [ i ]=numero;
         }
                    System.out.print("Ingresar numero a buscar :");
                    nbus=lectura.nextInt();
             //Proceso
             for (int i = 0; i < anumeros.length; i++) {
              
                    if (anumeros [i] ==nbus) {
                        mensaje="si existe el numero";
                        i=anumeros.length+1;
                    }else{
                        mensaje ="Numero no existe";
                    }
                     
                 }
                 //salida
                 System.out.println(mensaje);
       }
     }