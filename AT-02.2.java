/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Mavenproject3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        int Gas = 0;
        int Alc = 0;
        int Dis = 0;
        int numero;

        do {

            System.out.println("Alcool | 1");
            System.out.println("Gasolina | 2");
            System.out.println("Disel | 3");
            System.out.println("Info Completa | 4");
            System.out.println(" ");
            System.out.printf("Digite um Codigo: ");
            numero = sc.nextInt();

            if (numero == 1) {

                Gas = Gas + 1;

            } else if (numero == 2) {

                Alc = Alc + 1;
            } else if (numero == 3) {

                Dis = Dis + 1;
            } else {

                System.out.println("Codigo Invalido");
                System.out.println(" ");
            }

        } while (numero != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Gasolina: " + Gas);
        System.out.println("Alcool: " + Alc);
        System.out.println("Disel: " + Dis);

    }
}
