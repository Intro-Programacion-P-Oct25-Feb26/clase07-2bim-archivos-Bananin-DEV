/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";
        boolean bandera = true;
        int permiso;
        String cedula = "";

        while (bandera) {

            System.out.println("Desea continuar (1:si, 2:no)");
            permiso = entrada.nextInt();
            entrada.nextLine();

            if (permiso == 1) {

                System.out.println("Ingrese cedula");
                cedula = entrada.nextLine();

                System.out.println("Ingrese su nombre");
                String nombre = entrada.nextLine();

                System.out.println("Ingrese su apellido");
                String apellido = entrada.nextLine();

                System.out.println("Ingrese su edad");
                int edad = entrada.nextInt();
                entrada.nextLine();

                cadenaFinal = String.format("%s%s %s %d\n",
                        cadenaFinal, nombre, apellido, edad);

            } else {
                bandera = false;
            }
        }

        
            CrearArchivo.agregarRegistros(cadenaFinal, cedula);
        
    }
}
