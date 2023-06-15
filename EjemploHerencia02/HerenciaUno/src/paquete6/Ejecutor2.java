/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos

        // Trabajo clases 15 junio 2023
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        String cadena = "";

        while (bandera) {

            // Creación de un objeto de tipo EstudiantePresencial
            entrada.useLocale(Locale.US);
            System.out.println("Ingrese nombre");
            String n = entrada.nextLine();
            System.out.println("Ingrese apellido");
            String ap = entrada.nextLine();
            System.out.println("Ingrese identificación");
            String ced = entrada.nextLine();
            System.out.println("Ingrese edad");
            int edad = entrada.nextInt();
            System.out.println("Ingrese número de créditos");
            int creditos = entrada.nextInt();
            System.out.println("Ingrese costo de créditos");
            double costo = entrada.nextInt();

            EstudiantePresencial estPresencial = new EstudiantePresencial(n,
                    ap, ced, edad, costo, creditos);

            estPresencial.calcularMatriculaPresencial();

            entrada.nextLine();

            System.out.println("--------------");

            cadena = String.format("%s\n%s", cadena, estPresencial);
            
            
        cadena = String.format("%s\n"
                + "Numero de creditps: %d\n"
                + "Costo creditos: %.2f\n"
                + "Total Matricula: %.2f\n",
                cadena,
                estPresencial.obtenerNumeroCreditos(),
                estPresencial.obtenerCostoCredito(),
                estPresencial.obtenerMatriculaPresencial());

            System.out.println("Desea salir, pulse S");
            String opcion = entrada.nextLine();
            if (opcion.equals("S")) {

                bandera = false;
            }
        }
        System.out.println("\n Estudiantes: ");
        System.out.printf("%s\n", cadena);

    }
}
