/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.t119.proyectomaven;

import com.cice.t119.proyectomaven.dto.ContactoDTO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * arrayList de contactos
 * convertir a gson
 * lo pintamos en la agenda
 * lo leemos y lo transformamos de nuevo arraylist de contactos
 * @author cice
 */
public class NewMain {
   
    private static List<ContactoDTO> listcontacto = new ArrayList<>();
    
    public static void main (String[] args) {
    
        ContactoDTO contacto1 = new ContactoDTO("Alicia","Gutiérrez","Valero","123456789");
        ContactoDTO contacto2 = new ContactoDTO("Alberto","Lázaro","Criado","123456788");
        ContactoDTO contacto3 = new ContactoDTO("Alejandro","Lázaro","Gutiérrez","123456780");
        listcontacto.add(contacto1);
        listcontacto.add(contacto2);
        listcontacto.add(contacto3);
        
        File file = new File("ficheros/listadocontactos.txt");
        try {
            FileWriter fw = new FileWriter(file);
            Gson gson= new Gson();
           // Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(listcontacto);
                   
                    
            fw.write(gson.toJson(listcontacto));
            fw.close();
            
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String cadena= bf.readLine();
            
            
            List<ContactoDTO> listadocontacto = gson.fromJson(cadena, new TypeToken<List<ContactoDTO>>() {}.getType());
            
            
           
            for(ContactoDTO contacto: listadocontacto) {
                System.out.println("Nombre: "+ contacto.getNombre());
            }
            
            
        } catch (IOException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
   
    
    }
    
}
