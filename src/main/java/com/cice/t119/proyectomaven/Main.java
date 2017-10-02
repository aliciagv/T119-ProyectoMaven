
package com.cice.t119.proyectomaven;

import com.cice.t119.proyectomaven.dto.ContactoDTO;
import com.cice.t119.proyectomaven.dto.DireccionDTO;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


/**
 *
 * @author cice
 */
public class Main {
    
    public static void main (String[] args) {
    
    File file = new File("ficheros/agenda.txt");
        try {
            FileWriter fw= new FileWriter(file);
            ContactoDTO contacto= new ContactoDTO("Alicia","Gutiérrez","Valero","666666666");
            DireccionDTO direccion = new DireccionDTO("Calle Povedilla","4","28009","Madrid");
            contacto.setDireccion(direccion);
            List<String> email = new ArrayList<>();
            email.add("agv@test.com");
            email.add("ali@test.com");
            contacto.setEmail(email);
            Gson gson = new Gson(); // menos legible, todo en una línea
            //Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json= gson.toJson(contacto); // devuelve un string
            json=Base64.getEncoder().encodeToString(json.getBytes());

            fw.write(json);
            
            fw.close();
            
            FileReader fr = new FileReader(file);
            BufferedReader bf =new BufferedReader(fr);
            
            String lecturacontacto= new String(Base64.getDecoder().decode(bf.readLine()));
            
            
            ContactoDTO nuevoContacto = gson.fromJson(lecturacontacto, ContactoDTO.class);
            System.out.println("Nombre: " + nuevoContacto.getNombre());
            
            fr.close();
            bf.close();
            
        } catch (IOException ex) {
            System.out.println("ERROR");
        } 
       
    
    
    }
    
}
