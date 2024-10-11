import java.util.Scanner;

public class IMCCalculadora {
    public static void main(String[] args) {
        // Crear un objeto Scanner para recibir los datos del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar el peso
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();

        // Solicitar la altura
        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el resultado
        System.out.printf("Su IMC es: %.2f%n", imc);

        // Evaluar el resultado
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }

    }
}

