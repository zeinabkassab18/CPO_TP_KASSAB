/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpo_addition;

import java.util.Scanner;

/**
 *
 * @author kassab10
 */
public class TPO_addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nb; // nombre d'entiers à additionner 
        int result; // resultat 
        int ind; // indice 
        // initialisation 
        nb = 5;
        result = 0;
        //addition des nb premiers entiers 
        ind = 1;
        while (ind < nb) {
            result = result + ind;
            ind++;
        }
        // Affichage résultat 
        Scanner sc = new Scanner (System.in); 
        System.out.println("Entrer le nombre : " );
        nb = sc.nextInt();
    }
}

