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
 
public class codigo7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas = 4;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        int suma = 0;
 
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Ingrese el valor para la fila " + i + ", columna " + j + ": ");
                matriz[i][j] = teclado.nextInt();
                suma = suma + matriz[i][j];
            }
        }
 
        System.out.println("Suma total de todos los elementos: " + suma);
 
        teclado.close();
    }
}
 