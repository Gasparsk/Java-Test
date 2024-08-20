/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.at06;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class AT06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x;
        int i;

        System.out.printf("Digite um Numero: ");
        x = sc.nextInt();

        for (i = 0; i < x; i++) {

            if (i % 2 == 1) {

                System.out.println("Numero: " + i);
            } else {
            }

        }
    }
}
