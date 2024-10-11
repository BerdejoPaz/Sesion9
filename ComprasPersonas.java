import java.util.Scanner;
/**
 Ejemplo:
    Ingrese el número de personas: 4
    Ingrese el monto de la compra de la persona 1: 200.75
    Ingrese el monto de la compra de la persona 2: 150.50
    Ingrese el monto de la compra de la persona 3: 320.00
    Ingrese el monto de la compra de la persona 4: 80.25
Resultado: 
    Total, de compras: 751.5
    Promedio de compras: 187.875
    Compra mayor: 320.0
    Compra menor: 80.25
 */
public class ComprasPersonas {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);
        // Solicitar el número de personas
        System.out.print("Ingrese el número de personas: ");
        int n = lectura.nextInt();
        // Crear un arreglo para almacenar las compras
        double[] compras = new double[n];
        // Leer las compras de cada persona
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = lectura.nextDouble();
        }
        // Inicializar variables para calcular el total, promedio, mayor y menor compra
        double totalCompras = 0;
        double compraMayor = compras[0];
        double compraMenor = compras[0];
        // Recorrer el arreglo para calcular el total, y encontrar la compra mayor y menor
        for (int i = 0; i < n; i++) {
            totalCompras += compras[i];
            if (compras[i] > compraMayor) {
                compraMayor = compras[i];
            }
            if (compras[i] < compraMenor) {
                compraMenor = compras[i];
            }
        }
        // Calcular el promedio de las compras
        double promedioCompras = totalCompras / n;
    
        // Mostrar el total de las compras, el promedio, la mayor y menor compra
        System.out.println("\nTotal de compras: " + totalCompras);
        System.out.println("Promedio de compras: " + promedioCompras);
        System.out.println("Compra mayor: " + compraMayor);
        System.out.println("Compra menor: " + compraMenor);
    }
}