
package manejodearchivo2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CrearArchivoListas();
        
    }
    private static void CrearArchivoListas(){
        
        List<String> lineas = Arrays.asList(
        "Emil",
        "Mateo",
        "Castro"
        );
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("archivo.txt"))){
            for (String linea : lineas){
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Archivo escrito correctamente");
        }catch(IOException e){
            System.out.println("Error al escribir archivo" + e.getMessage());
        }
    }
    
    private static void LeerArchivoListas() throws FileNotFoundException, IOException{
        
        List<String> lineas = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader("Archivo.txt"))) {
            
            String linea;
            
            while((linea = reader.readLine())!= null){
             lineas.add(linea);   
            }  
        }catch(IOException e){
            System.out.println("Error al leer archivo" + e.getMessage());
        
    }
        System.out.println("Contenido del archivo: ");
        
        
        for(String linea : lineas){
            System.out.println(linea);
        }
}
     
    
}

