/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import java.io.File;

/**
 *
 * @author nlopezjimenez
 */
public class EjemploFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LeerFichero prueba = new LeerFichero();
        EscribirFich obx = new EscribirFich();
        //prueba.leerFichero("nomes.txt");
       // prueba.leerFichero("file:///home/local/DANIELCASTELAO/nlopezjimenez/Escritorio/ejemplo2.txt");
        
        //prueba.leerNumeros("alumno.txt");
        //prueba.visualizarArray();
        //obx.escribir("num.txt");
        obx.escribir("alumnota.txt");
    }
    
}
