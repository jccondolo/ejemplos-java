/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivos3ejercicio;

/**
 *
 * @author juancarlos
 */
public class Ejecutor {
    
       public static void main(String[] args) {
        LeerArchivoTexto aplicacion = new LeerArchivoTexto();
        
        aplicacion.abrirArchivo();
        aplicacion.leer_informacion();
        aplicacion.cerrarArchivo();
    }
}

