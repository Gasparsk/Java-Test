/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.at10;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class AT10 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        int x;

        System.out.printf("Digite um Valor de entrada: ");
        x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            if (i % 2 == 1) {

                System.out.println("Numeros Impares: " + i);

            } else {
            }

        }

    }
}
