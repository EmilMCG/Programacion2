/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasfor;

import java.util.ArrayList;

/**
 *
 * @author Sala de Sistemas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int i;
        ArrayList<Integer> lst = new ArrayList();
     
     lst.add(200);
     lst.add(300);
     lst.add(400);
     lst.add(500);
     
     
     for (i=0;  i< lst.size();i++){
         
         System.out.println("Los valores del array son: " +lst.get(i));
         
         System.out.println("Imprimiendo Lista despues de eliminacion" +lst.remove(i));
         
         System.out.println(lst);
     }
    }
    
}
