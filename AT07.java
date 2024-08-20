/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.at07;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class AT07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x;
        int in = 0, out = 0;
        int numero;

        System.out.printf("Digite um Valor de Repeticao: ");
        x = sc.nextInt();

        for (int i = 0; i < x; i++) {

            System.out.printf("Digite um Valor: ");
            numero = sc.nextInt();

            if (numero >= 10 && numero <= 20) {

                in++;

            } else {

                out++;

            }

        }
        System.out.println("Numero In: " + in);
        System.out.println("Numero Out: " + out);
    }

}
