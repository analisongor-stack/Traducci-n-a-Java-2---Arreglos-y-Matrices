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
public class codigo2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cantidad = 10;
        double[] numeros = new double[cantidad];
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero real " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
            suma = suma + numeros[i];
        }
        double promedio = suma / numeros.length;
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        teclado.close();
    }
}