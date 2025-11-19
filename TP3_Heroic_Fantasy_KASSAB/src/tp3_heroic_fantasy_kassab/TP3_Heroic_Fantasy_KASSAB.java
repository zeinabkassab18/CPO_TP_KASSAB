/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_kassab;

import java.util.ArrayList;

/**
 *
 * @author kassab10
 */
public class TP3_Heroic_Fantasy_KASSAB {

    public static void main(String[] args) {

        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        ArrayList<Arme> armes = new ArrayList<>();

        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
        Magicien gandalf   = new Magicien("Gandalf", 65, true);   // confirmé
        Magicien garcimore = new Magicien("Garcimore", 44, false); // novice

        Guerrier conan     = new Guerrier("Conan", 78, false);    // à pied
        Guerrier lannister = new Guerrier("Lannister", 45, true); // à cheval

        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(gandalf);
        personnages.add(garcimore);
        personnages.add(conan);
        personnages.add(lannister);

        System.out.println("\n Personnages");
        for (Personnage p : personnages) {
            System.out.println(p);
        }
        
        System.out.println("\n=== Point 3 : Gestion des armes ===");

 
        Guerrier g = new Guerrier("Arthur", 80, true);      
        Magicien m = new Magicien("Merlin", 70, false);     

        Baton b1 = new Baton("Bâton ancien", 3, 2);
        Baton b2 = new Baton("Bâton elfique", 4, 4);
        Baton b3 = new Baton("Bâton runique", 5, 6);

        Epee e1 = new Epee("Lame rapide", 6, 3);
        Epee e2 = new Epee("Épée lourde", 7, 5);
        Epee e3 = new Epee("Rapière", 8, 4);

        g.ajouterArme(b1);
        g.ajouterArme(e1);
        g.ajouterArme(e2);
        g.equiper("Lame rapide");

      
        m.ajouterArme(b2);
        m.ajouterArme(b3);
        m.ajouterArme(e3);

      
        System.out.println("\nNombre de bâtons de " + m.getNom() + " : " + m.getNbBatons());

        System.out.println("\n=== Personnages (point 3) ===");
        System.out.println(g);
        System.out.println(m);
    }
}
  


   
