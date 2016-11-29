/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicioenclase1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeerArchivo {

    private Scanner entrada;

    // permite al usuario abrir el archivo
    public void abrirArchivo() {
        try {
            entrada = new Scanner(new File("clase.txt"));
        } // fin de try
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del método abrirArchivo

    // lee registro del archivo
    public void leer_informacion() {
        double nota1 = 0;
        double nota2 = 0;
        double p;
        double mp = 0;
        String nom, apell;
        int valor = 0, valores = 0;
        try // lee registros del archivo, usando el objeto Scanner
        {

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                //System.out.println(linea);
                ArrayList<String> linea_partes = new ArrayList<String>(Arrays.asList(linea.split(";")));
                //System.out.println(linea_partes.get(2) + linea_partes.get(3));               
                nom = linea_partes.get(0);
                apell = linea_partes.get(1);
                nota1 = Double.parseDouble(linea_partes.get(2));
                nota2 = Double.parseDouble(linea_partes.get(3));
                p = (nota1 + nota2) / 2;
                
                System.out.printf("Promedio de calificaciones de: %s %s es :% .2f \n", nom, apell, p);

                if (p > mp) {
                    mp = p;
                }
            }
            System.out.printf("Mejor Promedio Es: %.2f \n", mp ,"/n");

            /*0int suma = 0;
                for (int i = 0; i < linea_partes.size(); i++) {
                    suma = linea_partes;
                    System.out.println(""+ suma);
                       
                }*/
            // fin de while
        } // fin de try
        catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del metodo leerRegistros
    // cierra el archivo y termina la aplicación

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del metodo cerrarArchivo
} // fin de la clase LeerArchivoTexto

