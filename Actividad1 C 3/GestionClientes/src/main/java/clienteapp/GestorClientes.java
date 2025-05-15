/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clienteapp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Emil Mateo Castro Gallo y Duban Santiago Vasquez Gallo
 */
public class GestorClientes {
    private static final String RUTA_ARCHIVO = "Clientes.json";
    private static Gson gson = new Gson();

  
    public static void guardarClientes(String cedula, String nombre, String apellido, String direccion, String telefono, String email) {
        Map<String, Clientes> clientesMap = listarClientes(); 

        Clientes cliente = new Clientes(cedula, nombre, apellido, direccion, telefono, email);
        clientesMap.put(cedula, cliente); 

        try (Writer writer = new FileWriter(RUTA_ARCHIVO)) {
            gson.toJson(clientesMap, writer);
        } catch (IOException e) {
            System.out.println("Error al guardar cliente: " + e.getMessage());
        }
    }

    // Método para listar todos los clientes
    public static Map<String, Clientes> listarClientes() {
        File archivo = new File(RUTA_ARCHIVO);
        if (!archivo.exists()) {
            return new HashMap<>();
        }

        try (Reader reader = new FileReader(RUTA_ARCHIVO)) {
            Type tipoMapa = new TypeToken<Map<String, Clientes>>(){}.getType();
            return gson.fromJson(reader, tipoMapa);
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
            return new HashMap<>();
        }
    }
}

