/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.at09;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class AT09 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
     
        int x;
       
     
     
        System.out.printf("DIGITE UM NUMERO PARA TABUADA:");
        x = sc.nextInt();
       
        for (int i = 1; i <= 10; i++) {
           
            int resultado = x * i;
           
            System.out.println( x + "x" + i + "=" + resultado);
           
        }
       
    }
}
