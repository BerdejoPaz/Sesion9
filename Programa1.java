package Programas;

/**
 Crear un programa en Java que permita registrar las edades de los n alumnos 
en un arreglo de datos. Visualizar la edad promedio. 
Por ejemplo:
n=5
edad1=18
edad2=18
edad3=42
edad4=24
edad5=35
Resultados:
pe=27.4
 */
import java.util.Scanner;
public class Programa1 {
        public static void main(String args[] ) {
            //Declarar Variables
            int i,n,edad;
            double pe,acedad;
            Scanner lectura=new Scanner(System.in);
            //entrada de datos
            System.out.print("Ingresa cantidad de edades :  ");
            n=lectura.nextInt();
            int [ ] aedades=new int[n];
            acedad=0.0;
            for (i = 0; i < n; i++) {
                System.out.print("Ingresar edad "+(i+1)+":");
                edad=lectura.nextInt();
                aedades[ i ]=edad;
            }
          
            //proceso de datos
            for (int j = 0; j < n; j++) {
                acedad+=aedades[j];
            }
            pe=acedad/n;
            //Salida de datos
            System.out.println("El promedio de edades es :" +pe);
         }
 }
