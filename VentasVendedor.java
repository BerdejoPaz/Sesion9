import java.util.Scanner;
public class VentasVendedor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de ventas
        System.out.print("Ingrese el número de ventas realizadas: ");
        int n = scanner.nextInt();

        // Arreglo para almacenar las ventas
        double[] ventas = new double[n];
        // Llenar el arreglo con los datos de ventas
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la venta " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }

        // Calcular el total de ventas
        double totalVentas = 0;
        for (double venta : ventas) {
            totalVentas += venta;
        }

        // Calcular el promedio de ventas
        double promedioVentas = totalVentas / n;

        // Encontrar la venta menor
        double ventaMenor = ventas[0];
        for (double venta : ventas) {
            if (venta < ventaMenor) {
                ventaMenor = venta;
            }
        }

        // Mostrar los resultados
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
        System.out.println("Venta menor: " + ventaMenor);

        
    }
}