/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tablasdemultiplicar;

/**
 *
 * @author Leonel
 */

import java.util.Scanner;
public class TablasdeMultiplicar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Eligue cual tabla de multiplicar quieres visualizar del 1 al 10");
        int tabla = leer.nextInt();
       for(int i=1; i<=10; i++){
           System.out.println(tabla + "x" + i + "= " + i*tabla);
       }
    }
}
