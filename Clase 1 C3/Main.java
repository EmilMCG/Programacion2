
package manejodearchivo2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
        
        try(Bufferedwriter = new BufferedWriter(new Filewriter("archivo.txt"))){
            for (String linea : lineas){
                writer.write(linea);
                writer.newLine();
            }
            System.out.println("Archivo escrito correctamente");
        }catch(IOException e){
            System.out.println("Error al escribir archivo" + e.getMessage());
        }
    }
    
    private static void LeerArchivoListas(){
        
    }
    
}
