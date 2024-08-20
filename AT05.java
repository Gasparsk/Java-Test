/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.at05;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class AT05 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);

        int numero;

        do {

            System.out.printf("Digite um Numero: ");
            numero = sc.nextInt();

        } while (numero < 1 || numero > 5);

        System.out.println(" ");
        System.out.println("Codigo Finalizado");
    }
}
