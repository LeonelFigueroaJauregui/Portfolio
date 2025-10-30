package com.mycompany.tarea9_arraylist;

//Escribe un programa que permita al usuario ingresar una cadenas de texto en un ArrayList. 
//El programa debera mostrar las cadenas de texto en orden inversos.

import java.util.ArrayList;
import java.util.Scanner;

public class Tarea9_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cadenas = new ArrayList<>();

        System.out.println("Ingrese cadenas de texto (escriba 'salir' para terminar):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("salir")) {
                break;
            }
            cadenas.add(input);
        }

        System.out.println("\nCadenas en orden inverso:");
        for (int i = cadenas.size() - 1; i >= 0; i--) {
            System.out.println(cadenas.get(i));
        }

        scanner.close();
    }
}


