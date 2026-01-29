/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        boolean continuarIngreso = true;

        while (continuarIngreso) {

            System.out.println("Ingrese su nombre:");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese su cédula:");
            String cedula = teclado.nextLine();

            System.out.println("Ingrese su placa:");
            String placa = teclado.nextLine();
            String inicialPlaca = placa.substring(0, 1);

            System.out.println("Ingrese su marca:");
            String marca = teclado.nextLine();

            String registro = String.format(
                    "%s, %s, %s, %s%n",
                    nombre, cedula, placa, marca);

            Procesos.DatoscrearArchivo(inicialPlaca, registro);

            System.out.println("¿Desea ingresar más datos? (Si/No)");
            String respuesta = teclado.nextLine();

            if (respuesta.equalsIgnoreCase("No")) {
                continuarIngreso = false;
            }
        }

        teclado.close();
    }
}

