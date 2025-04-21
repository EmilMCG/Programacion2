
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Programa creado por Duban Vasquez G y Emil Castro G
 */
public class Parcial2 {
     static double[] array = new double[10];
    static double[][] matriz = new double[4][4];
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    calcularAreaCirculo();
                    break;
                case 2:
                    ingresarDatosArray();
                    break;
                case 3:
                    listarDatosArray();
                    break;
                case 4:
                    listarDatoEspecificoArray();
                    break;
                case 5:
                    ingresarDatosMatriz();
                    break;
                case 6:
                    listarDatosMatriz();
                    break;
                case 7:
                    listarDatoEspecificoMatriz();
                    break;
                case 8:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
            System.out.println();
        } while (opcion !=8);
    }

    static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Area del Circulo");
        System.out.println("2. Ingresar Datos al Array");
        System.out.println("3. Listar Datos del Array");
        System.out.println("4. Listar Dato Especifico del Array");
        System.out.println("5. Ingresar Datos a la Matriz");
        System.out.println("6. Listar Datos de la Matriz");
        System.out.println("7. Listar Dato Especifico de la Matriz");
        System.out.println("8. Salir del programa");
        System.out.print("Seleccione una opcion del 1 a 8: ");
        System.out.println("\nPrograma creado por Duban Vasquez G y Emil Castro G");
    }

    static void calcularAreaCirculo() {
        System.out.print("Ingrese el radio del circulo: ");
        double radio = leer.nextDouble();
        double area = Math.PI*radio*radio;
        System.out.println("El area del circulo es: "+area);
    }

    static void ingresarDatosArray() {
        for (int i=0;i<array.length;i++) {
            System.out.print("Ingrese el valor en la posicion "+i+": ");
            array[i] = leer.nextDouble();
        }
    }

    static void listarDatosArray() {
        System.out.println("Datos del array:");
        for (int i=0;i<array.length;i++) {
            System.out.println("Posicion "+i+ ": "+array[i]);
        }
    }

    static void listarDatoEspecificoArray() {
        System.out.print("Ingrese la posicion del array (0-9): ");
        int posicion = leer.nextInt();
        if (posicion>=0&&posicion<array.length) {
            System.out.println("Dato en la posicion " +posicion+":"+array[posicion]);
        } else {
            System.out.println("Posicion invalida.");
        }
    }

    static void ingresarDatosMatriz() {
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print("Ingrese el valor en la posicion [" +i+ "][" +j+ "]: ");
                matriz[i][j] = leer.nextDouble();
            }
        }
    }

    static void listarDatosMatriz() {
        System.out.println("Datos de la matriz:");
        for (int i=0;i<matriz.length;i++) {
            for (int j=0;j<matriz[i].length;j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void listarDatoEspecificoMatriz() {
        System.out.print("Ingrese la fila (0-3): ");
        int fila = leer.nextInt();
        System.out.print("Ingrese la columna (0-3): ");
        int columna = leer.nextInt();

        if (fila>=0&&fila<4&&columna>=0&&columna<4) {
            System.out.println("Dato en la posicion [" +fila+ "][" +columna+ "]: " +matriz[fila][columna]);
        } else {
            System.out.println("Posicion invalida.");
        }
    }
}