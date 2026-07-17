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
 
public class codigo3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 15;
        int[] numeros = new int[cantidad];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero entero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posMenor = i;
            }
        }
        System.out.println("Numero mayor: " + mayor + " (posicion " + posMayor + ")");
        System.out.println("Numero menor: " + menor + " (posicion " + posMenor + ")");
        teclado.close();
    }
}
