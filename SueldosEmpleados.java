import java.util.Scanner;
public class SueldosEmpleados {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Solicitar el número de empleados
        System.out.print("Ingrese el número de empleados: ");
        int n = lectura.nextInt();
        
        // Arreglo para almacenar los sueldos
        double[] sueldos = new double[n];
        
        // Llenar el arreglo con los sueldos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = lectura.nextDouble();
        }
        
        // Calcular el sueldo promedio
        double suma = 0;
        for (double sueldo : sueldos) {
            suma += sueldo;
        }
        double sueldoPromedio = suma / n;
        
        // Encontrar el sueldo mayor
        double sueldoMayor = sueldos[0];
        for (double sueldo : sueldos) {
            if (sueldo > sueldoMayor) {
                sueldoMayor = sueldo;
            }
        }
        
        // Mostrar los resultados
        System.out.println("Sueldo promedio: " + sueldoPromedio);
        System.out.println("Sueldo mayor: " + sueldoMayor);
        
     }
}