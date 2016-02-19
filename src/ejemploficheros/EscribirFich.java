/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


/**
 *
 * @author nlopezjimenez
 */
public class EscribirFich {
    public void escribir(String nombreFichero) {
        File f = new File(nombreFichero);
         PrintWriter escribir=null;
        try {
            //abrimos fichero para escribir
            escribir = new PrintWriter(f);
            for(int i = 0;i<4;i++)
            escribir.println("");
        } catch (FileNotFoundException ex) {
            System.out.println("Error escritura"+ex.getMessage());
        }
        finally{
            escribir.close();
        }
        
    }
}
