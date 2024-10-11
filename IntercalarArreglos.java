import java.util.Scanner;
/**
 Ejemplo:
Ingrese 5 números para el arreglo a:
    a[0]: 10
    a[1]: 20
    a[2]: 30
    a[3]: 40
    a[4]: 50
    Ingrese 5 números para el arreglo b:
    b[0]: 60
    b[1]: 70
    b[2]: 80
    b[3]: 90
    b[4]: 100
Resultado:
Arreglo c intercalado:
    10 60 20 70 30 80 40 90 50 100
 */
public class IntercalarArreglos {
    public static void main(String[] args) {
        // Crear objetos Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);

        // Crear arreglos a y b con 5 elementos cada uno
        int[] a = new int[5];
        int[] b = new int[5];
        
        // Leer los valores del arreglo a
        System.out.println("Ingrese 5 números para el arreglo a:");
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = lectura.nextInt();
        }

        // Leer los valores del arreglo b
        System.out.println("\nIngrese 5 números para el arreglo b:");
        for (int i = 0; i < 5; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = lectura.nextInt();
        }

        // Crear un arreglo c que tendrá el doble de tamaño (10 elementos) para almacenar los valores intercalados
        int[] c = new int[10];

        // Intercalar los valores de a y b en el arreglo c
        int indiceC = 0;
        for (int i = 0; i < 5; i++) {
            c[indiceC++] = a[i];  // Insertar un elemento de a
            c[indiceC++] = b[i];  // Insertar un elemento de b
        }

        // Mostrar los valores del arreglo c intercalado
        System.out.println("\nArreglo c intercalado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }
    }
}