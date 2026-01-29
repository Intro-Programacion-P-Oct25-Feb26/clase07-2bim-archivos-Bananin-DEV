/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Formatter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Procesos {

    public static void DatoscrearArchivo(String inicial, String mensaje) {

        try {

            if (inicial.equals("L")) {
                Formatter salida = new Formatter(
                        new OutputStreamWriter(
                                new FileOutputStream("data/PlacaLoja.txt", true)));
                salida.format("%s", mensaje);
                salida.close();

            } else if (inicial.equals("G")) {
                Formatter salida = new Formatter(
                        new OutputStreamWriter(
                                new FileOutputStream("data/PlacaGuayas.txt", true)));
                salida.format("%s", mensaje);
                salida.close();

            } else if (inicial.equals("P")) {
                Formatter salida = new Formatter(
                        new OutputStreamWriter(
                                new FileOutputStream("data/PlacaPichincha.txt", true)));
                salida.format("%s", mensaje);
                salida.close();

            } else {
                Formatter salida = new Formatter(
                        new OutputStreamWriter(
                                new FileOutputStream("data/DatosSinCategoria.txt", true)));
                salida.format("%s", mensaje);
                salida.close();
            }

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");
        }
    }
}
