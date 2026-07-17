/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenjava1;

/**
 *
 * @author BRTHANY CUENCA
 */
import java.util.Scanner;
 
public class codigo4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 20;
        int[] numeros = new int[cantidad];
        int cantPares = 0;
        int cantImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero entero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
 
            if (numeros[i] % 2 == 0) {
                cantPares++;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantImpares++;
                sumaImpares = sumaImpares + numeros[i];
            }
        }
        System.out.println("Cantidad de pares: " + cantPares);
        System.out.println("Cantidad de impares: " + cantImpares);
        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);
        teclado.close();
    }
}