/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trycatch;

import java.util.Scanner;

/**
 *
 * @author criss
 */
public class TryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingrese un numero:");
            int numero = sc.nextInt();
            System.out.println("Ingresaste el numero: " + numero + " :D");
        }catch(Exception variable_de_error){
            System.out.println("Mira, ingresaste una palabra o algo mas pero no un numero >:c");
        }
        System.out.println("Fin del programa");
    }
}
