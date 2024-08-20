/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.at02;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class AT02 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int numero;

        do {

            System.out.printf("Digite um Numero: ");
            numero = sc.nextInt();

            if (numero != 2002) {

                System.out.println("Senha Invalida");
            } else {}

        } while (numero != 2002);

        System.out.println("Acesso Permitido");

    }
}
