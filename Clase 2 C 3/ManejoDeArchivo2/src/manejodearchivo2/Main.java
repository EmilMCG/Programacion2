import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ing. Narvaez Mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //CrearArchivoListas();
        
        //LeerArchivoListas();
        
        String ARCHIVO_JSON = "datos.json";
        Map<String,String> usuario = new HashMap();
        usuario.put("nombre", "Ivan Narvaez");
        usuario.put("username","namey811");
        usuario.put("clave", "abc123");
        
        //CrearArchivoMapas(usuario,ARCHIVO_JSON);
        Map<String,String> Usuarios = LeerArchivoMapas(ARCHIVO_JSON);
        System.out.println("Esto son los datos en el archivo: " + Usuarios);
        
        
    }
    
 
       
   private static void CrearArchivoMapas(Map<String,String> datos, String archivo){
       Gson gson = new Gson();
       try (FileWriter writer = new FileWriter(archivo)) {
            gson.toJson(datos, writer);
            System.out.println("Datos escritos correctamente en " + archivo);
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
 
   
    
   private static void LeerArchivoListas(){
       
       List<String> lineas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("archivo.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Mostrar el contenido leído
        System.out.println("Contenido del archivo:");
        for (String linea : lineas) {
            System.out.println(linea);
        }
   
   }
   
   private static Map<String,String> LeerArchivoMapas(String archivo){
       Gson gson = new Gson();
       try (FileReader reader = new FileReader(archivo)) {
            Type tipoMapa = new TypeToken<HashMap<String, String>>() {}.getType();
            Map<String, String> datos = gson.fromJson(reader, tipoMapa);
            System.out.println("Datos leidos correctamente desde " + archivo);
            return datos;
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return new HashMap<>();
        }
       
   }
    
}