
package com.mycompany.ejercicio9_arraylist;

import java.util.ArrayList;


public class Ejercicio9_arrayList {
    
    static ArrayList ejercicio;
    
    
        public static void main(String[] args) {
            
            //METODOS PARA AGREGAR
           ejercicio.add("Hola mundo");
           ejercicio.add(1, "Hola mundo 2");
           ejercicio.set(0, "Hola mundo 3");
            
            //METODOS PARA ELIMINAR
            ejercicio.remove(0);
            ejercicio.remove("Hola mundo");
            ejercicio.removeAll(ejercicio);
            ejercicio.clear();
            
            //METODO VERIFICA SI EXISTE ESE VALOR EN LA ARRAY LIST
            ejercicio.contains("Hola mundo 3");
            
            
        }

    
}

