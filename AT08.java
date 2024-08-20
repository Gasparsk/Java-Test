/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.at08;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class AT08 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        float media = 0;
        float nota;

        for (int i = 0; i < 3; i++) {

            System.out.printf("Digite sua %d nota: ", i + 1);
            nota = sc.nextFloat();

            media = media + nota;

        }

        media = media / 3;
        
        System.out.println("Sua Nota é: .2f" + media);

        if (media > 7) {

            System.out.println("Aprovado");

        } else {

            System.out.println("Reprovado");
        }

    }
}
