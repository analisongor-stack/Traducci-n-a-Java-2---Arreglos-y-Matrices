/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenjava1;

/**
 *
 * @author BRITHANY CUENCA
 */
import java.util.Scanner;
 
public class codigo5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 12;
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero positivo para la posicion " + i + ": ");
            int valor = teclado.nextInt();
            numeros[i] = valor + i;
        }
        System.out.println("Arreglo modificado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }
        teclado.close();
    }
}