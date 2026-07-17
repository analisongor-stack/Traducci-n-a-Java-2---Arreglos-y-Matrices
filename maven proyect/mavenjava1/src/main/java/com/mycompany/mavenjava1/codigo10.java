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
 
public class codigo10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas = 3;
        int columnas = 5;
        int[][] matriz = new int[filas][columnas];
 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la fila " + i + ", columna " + j + ": ");
                int valor = teclado.nextInt();
                matriz[i][j] = valor + (i * j);
            }
        }
 
        System.out.println("Matriz resultante:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
 
        teclado.close();
    }
}