/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.at03;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class AT03 {

    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        int Gas = 0;
        int Alc = 0;
        int Dis = 0;
        int numero;

        System.out.println("Alcool | 1");
        System.out.println("Gasolina | 2");
        System.out.println("Disel | 3");
        System.out.println("Info Completa | 4");
        System.out.println(" ");

        do {

            System.out.printf("Digite um Codigo: ");
            numero = sc.nextInt();

            if (numero == 1) {

                Gas = Gas + 1;

            } else if (numero == 2) {

                Alc = Alc + 1;
            } else if (numero == 3) {

                Dis = Dis + 1;
            } else if (numero != 4) {

                System.out.println("Codigo Invalido");
                System.out.println(" ");
            }

        } while (numero != 4);

        System.out.println(" ");
        System.out.println("MUITO OBRIGADO");
        System.out.println("Gasolina: " + Gas);
        System.out.println("Alcool: " + Alc);
        System.out.println("Disel: " + Dis);

    }
}
