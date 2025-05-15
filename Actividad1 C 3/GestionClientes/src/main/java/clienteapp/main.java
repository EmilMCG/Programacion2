/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clienteapp;
import java.util.Map;
/**
 *
 * @author Emil Mateo Castro Gallo y Duban Santiago Vasquez Gallo
 */
public class main {
    public static void main(String[] args) {
        // Guardar un cliente
        GestorClientes.guardarClientes("1234567890", "Emil", "Mateo", "San jose", "0987654321", "emilmateoc@gmail.com");

        // Listar clientes
        Map<String, Clientes> clientes = GestorClientes.listarClientes();

        for (Map.Entry<String, Clientes> entry : clientes.entrySet()) {
            Clientes c = entry.getValue();
            System.out.println("Cédula: " + c.getCedula());
            System.out.println("Nombre: " + c.getNombre() + " " + c.getApellido());
            System.out.println("Dirección: " + c.getDireccion());
            System.out.println("Teléfono: " + c.getTelefono());
            System.out.println("Email: " + c.getEmail());
            System.out.println("-----");
        }
    }
}
    

