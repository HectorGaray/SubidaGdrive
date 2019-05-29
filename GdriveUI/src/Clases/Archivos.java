/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

/**
 *
 * @author CoordinacionTI
 */
public class Archivos {
    
    
    public void creaAchivo(String nombre){
        try {
            String ruta = "C:\\Users\\CoordinacionTI\\Desktop\\"+nombre+".";
            String contenido="@echo off\n"+"echo -e "+"\n" + "HOL";

            File file = new File(ruta);
            // Si el archivo no existe es creado
            FileOutputStream pos= new  FileOutputStream(file);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(pos));
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}
