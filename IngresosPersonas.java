import java.util.Scanner;
/**
 * Ejemplo:
        Ingrese el número de personas: 4
       Ingrese el ingreso económico de la persona 1: 2500
       Ingrese el ingreso económico de la persona 2: 3200
       Ingrese el ingreso económico de la persona 3: 4000
       Ingrese el ingreso económico de la persona 4: 1500
Resultado:
        Ingreso promedio: 2800.0
        Ingreso mayor: 4000.0
 */
public class IngresosPersonas {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);
        // Solicitar el número de personas
        System.out.print("Ingrese el número de personas: ");
        int n = lectura.nextInt();
        // Crear un arreglo para almacenar los ingresos
        double[] ingresos = new double[n];
        // Leer el ingreso económico de cada persona
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso económico de la persona " + (i + 1) + ": ");
            ingresos[i] = lectura.nextDouble();
        }
        // Inicializar variables para calcular el ingreso promedio y el mayor ingreso
        double sumaIngresos = 0;
        double ingresoMayor = ingresos[0];
        // Recorrer el arreglo para calcular la suma de los ingresos y el mayor ingreso
        for (int i = 0; i < n; i++) {
            sumaIngresos += ingresos[i];
            if (ingresos[i] > ingresoMayor) {
                ingresoMayor = ingresos[i];
            }
        }
        // Calcular el ingreso promedio
        double ingresoPromedio = sumaIngresos / n;
        // Mostrar el ingreso promedio y el mayor ingreso
        System.out.println("\nIngreso promedio: " + ingresoPromedio);
        System.out.println("Ingreso mayor: " + ingresoMayor);
    }
}