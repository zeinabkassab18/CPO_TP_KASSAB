/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_kassab;

/**
 *
 * @author kassab10
 */
public class TP2_Bieres_KASSAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere ("Cuvée des Trolls" , 7.0 , "Dubuisson" ) ;
        BouteilleBiere Biere2 = new BouteilleBiere ("Leffe" , 6.6 , "Abbaye de Leffe") ; 
        BouteilleBiere Biere3 = new BouteilleBiere ("Ciel " , 6.8 , "Bordeaux" ) ;
        BouteilleBiere Biere4 = new BouteilleBiere ("Amour" , 6.0 , "Provence" ) ; 
        BouteilleBiere Biere5 = new BouteilleBiere ("jeu" , 8.0 , "Marseille") ;
        uneBiere.lireEtiquette();
        Biere2.lireEtiquette();
        Biere3.lireEtiquette();
        Biere4.lireEtiquette();
        Biere5.lireEtiquette() ;
        System.out.println (uneBiere) ; 
    }
    }
