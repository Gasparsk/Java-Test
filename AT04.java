/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.at04;

import java.util.Scanner;


public class AT04 {

    public static void main(String[] args) {
      
       
    Scanner sc = new Scanner(System.in);
     int numero = 0;
     int par = 0;
     int impar = 0;
     int num = 0;
     
     do{
     
         System.out.printf("DIGITE UM NUMERO:");
         numero = sc.nextInt();
         
         if (numero % 2 == 0 && numero >= 0){
         
             par++;
         
         }
         
         else if (numero % 2 == 1 && numero >= 0){
         
             impar++;
         
         }
         num++;
   
     } while (numero >= 0);
     
     num--;
     
     System.out.println("QUANTIDADE DE NUMEROS PARES:" + par);
     System.out.println("QUANTIDADE DE NUMEROS IMPARES:" + impar);
     System.out.println("QUANTIDADE DE NUMEROS INSERIDOS:" + num);
     
     
    }
}
