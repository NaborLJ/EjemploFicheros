/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nlopezjimenez
 */
public class AñadirFichero {
    public void Añadir(String nombreFichero, String dato){
        FileWriter fw= null;
        PrintWriter esc =null;
     try{
         fw = new FileWriter(nombreFichero,true);
         esc = new PrintWriter(fw);
         esc.append("\n");
         esc.append(dato);
     }catch (IOException ex){
         System.out.println("Error al añadir "+ex.getMessage());
         
     }
     finally{
         if(fw!=null)
             try {
                 fw.close();
         } catch (IOException ex) {
                 System.out.println("Error de cierre "+ ex.getMessage());
         }
             esc.close();
         }
     }
}

