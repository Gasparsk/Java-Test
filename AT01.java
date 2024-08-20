/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.at01;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class AT01 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.printf("Digite um Numero: ");
        numero = sc.nextInt();

        if (numero == 1) {

            System.out.println("Domingo");

        } else if (numero == 2) {

            System.out.println("Segunda");
        } else if (numero == 3) {

            System.out.println("Terca");
        } else if (numero == 4) {

            System.out.println("Quarta");
        } else if (numero == 5) {

            System.out.println("Quinta");
        } else if (numero == 6) {

            System.out.println("Sexta");
        } else if (numero == 7) {

            System.out.println("Sabado");
        } else {

            System.out.println("Numero Invalido");
        }

    }
}
