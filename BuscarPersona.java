import java.util.Scanner;
/**
 Ingrese 5 nombres de personas:
Nombre 1: Juan
Nombre 2: María
Nombre 3: Carlos
Nombre 4: Ana
Nombre 5: Pedro

Ingrese el nombre de la persona que desea buscar: Carlos
La persona Carlos se encuentra en la posicion 3 del areglo
 */
public class BuscarPersona {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer la entrada del usuario
        Scanner lectura = new Scanner(System.in);

        // Crear un arreglo para almacenar 5 nombres
        String[] nombres = new String[5];

        // Leer los nombres de las personas
        System.out.println("Ingrese 5 nombres de personas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = lectura.nextLine();
        }

        // Solicitar el nombre a buscar
        System.out.print("\nIngrese el nombre de la persona que desea buscar: ");
        String nombreBuscado = lectura.nextLine();

        // Inicializar una variable para indicar si se encuentra el nombre
        boolean encontrado = false;
        int posicion = -1;

        // Recorrer el arreglo para buscar el nombre
        for (int i = 0; i < 5; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        // Mostrar el resultado de la búsqueda
        if (encontrado) {
            System.out.println("La persona " + nombreBuscado + " existe en la posición " + (posicion + 1) + " del arreglo.");
        } else {
            System.out.println("La persona " + nombreBuscado + " no existe en el arreglo.");
        }
    }
}