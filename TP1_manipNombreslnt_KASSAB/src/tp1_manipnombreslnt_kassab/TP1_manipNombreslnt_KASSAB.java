/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombreslnt_kassab;

import java.util.Scanner;

/**
 *
 * @author kassab10
 */
public class TP1_manipNombreslnt_KASSAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Saisissez deux entiers ") ;
       Scanner sc = new Scanner (System.in);
       System.out.println("Saisissez le premier ; ");
       int entier1 = sc.nextInt ();
       System.out.println("Saisissez le deuxième : ");
       int entier2 = sc.nextInt () ; 
       System.out.println("Voici la somme : ") ;
       int result ; 
       result = entier1 + entier2 ;
       System.out.println(result) ;
       
       System.out.println ("Voici la difference :" );
       int result2 ;
       result2 = entier1 - entier2 ; 
       System.out.println(result2);
       
       System.out.println("Voici le produit : ");
       int result3 ; 
       result3 = entier1 * entier2 ;
       System.out.println(result3);
       
       System.out.println("Voici le quotient entier du premier par le second : ");
       int result4 ; 
       result4 = entier1 / entier2 ; 
       System.out.println(result4) ; 
       
       System.out.println("Voici le reste : ");
       int result5 ; 
       result5 = entier1 % entier2 ; 
       System.out.println(result5);
       
       
    }
    
}

