/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_kassab;

import java.util.Scanner;

/**
 *
 * @author kassab10
 */
public class TP2_convertisseurObjet_KASSAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur conv = new Convertisseur();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bonjour, saisissez une valeur : ");
        double valeur = sc.nextDouble();

        System.out.println("\nChoisissez la conversion à effectuer :");
        System.out.println("1) Celsius vers Kelvin");
        System.out.println("2) Kelvin vers Celsius");
        System.out.println("3) Celsius vers Fahrenheit");
        System.out.println("4) Fahrenheit vers Celsius");
        System.out.println("5) Kelvin vers Fahrenheit");
        System.out.println("6) Fahrenheit vers Kelvin");

        int choix = sc.nextInt();
        double resultat = 0;

        switch (choix) {
            case 1:
                resultat = conv.CelciusVersKelvin(valeur);
                break;
            case 2:
                resultat = conv.KelvinVersCelcius(valeur);
                break;
            case 3:
                resultat = conv.CelciusVersFarenheit(valeur);
                break;
            case 4:
                resultat = conv.FarenheitVersCelcius(valeur);
                break;
            case 5:
                resultat = conv.KelvinVersFarenheit(valeur);
                break;
            case 6:
                resultat = conv.FarenheitVersKelvin(valeur);
                break;
            default:
                System.out.println("Choix invalide !");
                sc.close();
                return;
        }

        System.out.println("\nRésultat de la conversion : " + resultat);
        System.out.println(conv); // affiche le nb de conversions
        sc.close();
    }
}

    
    
