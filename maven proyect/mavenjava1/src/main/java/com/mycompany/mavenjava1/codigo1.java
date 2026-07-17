/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenjava1;

/**
 *
 * @author BRITHANY CUENCA 
 */

import java.util.Scanner;
public class codigo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 10;
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero en la posicion " + i + ": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Valores almacenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
        teclado.close();
    }
}