/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

/**
 *
 * @author User
 */
import java.util.Formatter;
import java.util.Scanner;

public class CrearArchivo {

    static Scanner entrada = new Scanner(System.in);

    public static void agregarRegistros(String valor, String nombreArchivo) {
        String ruta = String.format("data/%s.txt", nombreArchivo);
        try {
            Formatter salida = new Formatter(ruta);
            salida.format("%s", valor);
            salida.close();
            System.out.println("Archivo creado correctamente");

        } catch (Exception e) {
            System.out.println("Error al crear el archivo");
        }
    }
}


