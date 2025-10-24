/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_kassab;

import java.util.Scanner;


/**
 *
 * @author kassab10
 */
public class TP1_convertisseur_KASSAB {
    public static double CelciusVersKelvin (double tCelsius) { 
        return tCelsius + 273.15 ; 
    }
    public static double KelvinVersCelsius (double tKelvin) { 
        return tKelvin - 273.15 ; 
    }
    public static double FarenheitVersCelcius (double tFarenheit) { 
        return (tFarenheit - 32) * 5 / 9 ; 
    }
    public static double CelciusVersFarenheit(double tCelcius) { 
        return tCelcius * 9.0 / 5.0 + 32;
    }
    public static double KelvinVersFarenheit(double tKelvin) { 
        double c = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(c) ; 
    }
    public static double FarenheitVersKelvin(double tFarenheit) { 
        double c = FarenheitVersCelcius (tFarenheit) ;
        return CelciusVersKelvin(c); 
    }
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Saisissez une valeur réelle (degrés celsius)  :") ;
        double valeur = sc.nextDouble ();
        System.out.println (valeur + "degrés celcius = "+ CelciusVersKelvin(valeur) + "K \ n");
        
        
        boolean continuer = true;

        while (continuer) {
            System.out.println("Choisissez la conversion :");
            System.out.println("1) Celcius → Kelvin");
            System.out.println("2) Kelvin → Celcius");
            System.out.println("3) Farenheit → Celcius");
            System.out.println("4) Celcius → Farenheit");
            System.out.println("5) Kelvin → Farenheit");
            System.out.println("6) Farenheit → Kelvin");
            System.out.println("0) Quitter");
            System.out.print("Votre choix : ");
            int choix = sc.nextInt();

            if (choix == 0) { 
                System.out.println("Au revoir !");
                break; 
            }

            System.out.print("Entrez la température à convertir : ");
            double t = sc.nextDouble();
            double res = 0;

            switch (choix) {
                case 1 -> res = CelciusVersKelvin(t);
                case 2 -> res = KelvinVersCelcius(t);
                case 3 -> res = FarenheitVersCelcius(t);
                case 4 -> res = CelciusVersFarenheit(t);
                case 5 -> res = KelvinVersFarenheit(t);
                case 6 -> res = FarenheitVersKelvin(t);
                default -> System.out.println("Choix invalide !");
            }

            if (choix >= 1 && choix <= 6)
                System.out.println("Résultat : " + res + "\n");
        }

        sc.close();
    }

    private static double KelvinVersCelcius(double k) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
        
        
        
       
        
 

