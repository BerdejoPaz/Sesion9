import java.util.Scanner;
/**
 Ejemplo:
    Ingrese el número de personas: 3 
    Ingrese el peso de la persona 1 (en kg): 70.5 
    Ingrese el peso de la persona 2 (en kg): 65.2
     Ingrese el peso de la persona 3 (en kg): 80.0 
Resultado:
    El peso promedio de las personas es: 71.9 kg
 */
public class PesoPersonas {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);

        // Solicitar el número de personas
        System.out.print("Ingrese el número de personas: ");
        int n = lectura.nextInt();

        // Crear un arreglo para almacenar los pesos
        double[] pesos = new double[n];

        // Leer el peso de cada persona
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + " (en kg): ");
            pesos[i] = lectura.nextDouble();
        }

        // Inicializar una variable para calcular la suma total de los pesos
        double sumaPesos = 0;

        // Recorrer el arreglo para calcular la suma de los pesos
        for (int i = 0; i < n; i++) {
            sumaPesos += pesos[i];
        }

        // Calcular el peso promedio
        double pesoPromedio = sumaPesos / n;

        // Mostrar el peso promedio
        System.out.println("\nEl peso promedio de las personas es: " + pesoPromedio + " kg");
    }
}