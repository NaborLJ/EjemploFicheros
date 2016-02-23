/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author nlopezjimenez
 */
public class LeerFichero {
    ArrayList<Alumno>lista = new ArrayList();
    public void leerFichero(String nombreFichero){
        File f = new File(nombreFichero);
        Scanner sc= null;
        try {
            f = new File (nombreFichero);
             sc = new Scanner(f);
             //tambien : sc = new Scanner(new File(nombreFichero));
             while(sc.hasNextLine()){
                 String res = sc.nextLine();
                 System.out.println(res);
                // tambien : System.out.println(sc.nextLine());
             }
        } catch (FileNotFoundException ex) {
            System.out.println("Error de fichero " + ex.toString());
        }
        finally {
            sc.close();
        }
    }
        public void leerDatoFichero(String nombreFichero){
            Scanner leer= null;
        try {
            leer = new Scanner(new File(nombreFichero)).useDelimiter("\\s*,\\s*");
            while(leer.hasNext()){
               System.out.println("**"+leer.next());
            }
        } catch (FileNotFoundException ex) {
           System.out.print("Error 2 "+ex.getMessage());
           
           
        }
        finally{
            if(leer != null)
                leer.close();
        }
        }
         public void leerNumeros(String nombreFichero){
            Scanner leer= null;
        try {
            leer = new Scanner(new File(nombreFichero)).useDelimiter("\\s*,\\s*");
            while(leer.hasNextInt()){
               System.out.println("**"+leer.nextInt());
            }
        } catch (FileNotFoundException ex) {
           System.out.print("Error 3 "+ex.getMessage());
           
           
        }
        finally{
            if(leer != null)
                leer.close();
        }
        
        
        
         }
          public ArrayList<Alumno> leerRegistro(String nombreFichero){
        
        Scanner sc= null;
        ArrayList<Alumno>lista = new ArrayList();
        try {
            File f = new File (nombreFichero);
             sc = new Scanner(f);
             
             while(sc.hasNextLine()){
                 String res = sc.nextLine();
                 String[]datos = res.split(",");
                 lista.add(new Alumno(datos[0],datos[1],Integer.parseInt(datos[2])));
                 
                 
               
             }
        } catch (FileNotFoundException ex) {
            System.out.println("Error de fichero " + ex.toString());
        }
        finally {
            sc.close();
        }
        return lista;
    }
    public void visualizarArray(){
            System.out.print(lista);
    }
     public void lerNotaPar(String nombreFicheroLec, String nombreFicheroEsc) {
        
         Scanner sc = null;
         PrintWriter escribir = null;
        try {
            File f = new File (nombreFicheroEsc);
            File x = new File (nombreFicheroLec);
            sc = new Scanner(x);
            escribir = new PrintWriter(f);
            while(sc.hasNextLine()){
                String res = sc.nextLine();
                String[]datos = res.split(",");
                if (Integer.parseInt(datos[2])%2==0){
                    escribir.println(datos[0]+","+datos[1]+","+Integer.parseInt(datos[2]));
                }
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Erro no ficheiro " + ex.toString());
        }
        finally{
            sc.close();
            escribir.close();
        }
        
    }
}
            
        
    

