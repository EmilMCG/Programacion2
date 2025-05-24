package ParcialCorte3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ParcialCorte3 {
   private int[][] matriz = new int[6][6];
    private final String archivo = "matriz.txt";

    // Método para guardar un valor en la matriz
    public void guardarDato(int fila, int columna, int valor) {
        // Validación para asegurarse de que los índices estén dentro de los límites
        if (fila >= 0 && fila < 6 && columna >= 0 && columna < 6) {
            matriz[fila][columna] = valor;
        } else {
            System.out.println("Índices fuera de rango. Deben estar entre 0 y 5.");
        }
    }

   
    public void guardarEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            // Usamos un bucle for-each para recorrer las filas de la matriz
            for (int[] fila : matriz) {
               
                for (int valor : fila) {
                    bw.write(valor + " ");
                }
                bw.newLine();
            }
            System.out.println("Matriz guardada exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

 
    public int[][] leerDesdeArchivo() {
        int[][] datos = new int[6][6];
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
      
            for (int i = 0; i < 6; i++) {
                String linea = br.readLine();
                if (linea != null) {
                    String[] valores = linea.split(" ");
                   
                    if (valores.length == 6) {
                        for (int j = 0; j < 6; j++) {
                            datos[i][j] = Integer.parseInt(valores[j]);
                        }
                    } else {
                        System.out.println("Advertencia: línea " + (i + 1) + " no tiene 6 valores.");
                    }
                }
            }
            System.out.println("Matriz leída exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir los valores en números: " + e.getMessage());
        }
        return datos;
    }


    public static void main(String[] args) {
        ParcialCorte3 p = new ParcialCorte3();
        
        p.guardarDato(0, 0, 5);
        p.guardarDato(1, 1, 8);
        

        p.guardarEnArchivo();
        

        int[][] matrizLeida = p.leerDesdeArchivo();
        

        for (int[] fila : matrizLeida) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}