/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliclos2025;

import java.util.Scanner;

/**
 *
 * @author Sala de Sistemas
 */
public class Cliclos2025 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean ciclos = true;
        double nota1 = 0, nota2 = 0, nota3 = 0;
        while(ciclos){
            Scanner lectura = new Scanner(System.in);
            
            System.out.println("MENU PRINCIPAL: \n 1. Digitar nota1 \n 2. Digitar Nota2 \n 3. Digitar Nota3 \n 4. Calcular Nota Final \n 5. SALIR \n " );
            System.out.println("DIGITA UNA OPCION");
            
            int opcion = lectura.nextInt();
            /*
            if(opcion == 1){
                System.out.println("HAZ SELECIONADO LA OPCION 1");
                ciclos = true;
            }
            if(opcion == 2){
                System.out.println("HAZ SELECIONADO LA OPCION 2");
            }
            if(opcion == 3){
                System.out.println("HAZ SELECIONADO LA OPCION 3");

            }
            if(opcion == 4){
                System.out.println("HAZ SELECIONADO LA OPCION 4");

            }
            if(opcion == 5){
                System.out.println("bye bye!! ");
                ciclos = false;
            }
            */
            
            switch (opcion){
                
                case 1 -> {
                    System.out.println("HAZ SELECCIONADO LA OPCION 1. Ingresa la primera nota:");
                    nota1 = lectura.nextDouble();
                    ciclos = true;
                }
                case 2 -> {
                    System.out.println("HAZ SELECCIONADO LA OPCION 2. Ingresa la segunda nota:");
                    nota2 = lectura.nextDouble();
                    ciclos = true;
                }
                case 3 -> {
                    System.out.println("HAZ SELECCIONADO LA OPCION 3. Ingresa la tercera nota:");
                    nota3 = lectura.nextDouble();
                    ciclos = true;
                }
                case 4 -> {
                    
                    double notaFinal = (nota1 + nota2 + nota3) / 3;
                    System.out.println("HAZ SELECCIONADO LA OPCION 4. La nota final es: " + notaFinal);
                    ciclos = true;
                }
                case 5 -> {
                    System.out.println("bye bye!! ");
                    ciclos = false;
                }
                default -> {
                    System.out.println("Opción no válida. Por favor selecciona una opción entre 1 y 5.");
                }
            }
        }
    }
}
