package com.mycompany.archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {
    //1. Se creará un archivo si no existe este, para que podamos ver la ruta
    //por defecto que guarda java para obtener estos archivos <- path relativa

    public static void main(String[] args) {
        //Definimos el nombre del archivo
        String nombre_archivo = "archivito.holis"; 
        //¿porque .holis y no .txt?
        //.docs, .xml, .json, .txt, .wad indican al programa como leer el archivo
        //por defecto se guarda la información como texto plano, asi que vamos a hacer uso de eso
        //y el .holis por defecto se guardará como si fuera texto plano.
        
        //Hacemos uso de File para crear un objeto tipo archivo que represente a archivito.holis
        File file = new File(nombre_archivo);
        
        //Si el archivo no existe, se creará
        if(!file.exists()){
            try {
                //Creamos el archivo
                file.createNewFile();
                System.out.println("Felicidades, se ha creado el archivo " + nombre_archivo);                
            } catch (IOException ex) {
                System.out.println("Error al crear el archivo, " + ex.getMessage());
            }
        }
        
        //Ahora vamos a escribir en el archivo
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
            bw.write("Esto es un ejemplo de escritura :D");
            bw.newLine(); //Salto de linea
            bw.write("Esto esta escrito en una nueva linea");
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo, " + ex.getMessage());
        }
        
        try {
            //Vamos a abrir el archivo y escribi algo
            //bufferReader para poder leer linea por linea
            BufferedReader br = new BufferedReader(new FileReader(file));
            //Declaramos una variable para guardar la linea que se lee
            String linea = "";
            //Hacemos un ciclo para leer linea por linea
            linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            
            //otra forma para hacerlo es esta:
            /*
                while((linea = br.readLine()) != null){
                    System.out.println(linea);
                }
            */
        } catch (FileNotFoundException ex) {
            System.out.println("Error al leer el archivo, " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo, " + ex.getMessage());
        }
    }
}
