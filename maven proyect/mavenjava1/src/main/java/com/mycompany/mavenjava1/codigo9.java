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
 
public class codigo9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas = 5;
        int columnas = 5;
        int[][] matriz = new int[filas][columnas];
 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la fila " + i + ", columna " + j + ": ");
                matriz[i][j] = teclado.nextInt();
            }
        }
 
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
 
        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
 
        teclado.close();
    }
}