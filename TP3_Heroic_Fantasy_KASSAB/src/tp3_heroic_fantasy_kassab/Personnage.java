/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_kassab;

import java.util.ArrayList;

/**
 *
 * @author kassab10
 */
public abstract class Personnage {
    protected String nom;
    protected int niveauVie;
    
    protected ArrayList<Arme> inventaire ; 
    protected Arme armeEnMain ;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaire = new ArrayList<>() ; 
        this.armeEnMain = null ; 
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }
    
    public void ajouterArme (Arme a) {
        if (inventaire.size()<5) {
            inventaire.add(a) ; 
            System.out.println(nom + "ajoute l'arme" + a.getNom()+"à son inventaire.");
        } else {
            System.out.println(nom + "ne peut pas porter plus de 5 armes.");
        }
    }
    
    public Arme getArmeEnMain () {
        return armeEnMain ; 
    } 
    
    public void equiper (String nomArme) {
        Arme trouvee = null ; 
        for (Arme a : inventaire) {
            if (a.getNom().equals(nomArme)) {
                trouvee = a ; 
                break ; 
            }
        }
        
        if (trouvee != null) {
            armeEnMain = trouvee ; 
            System.out.println (nom + "s'équipe avec" + armeEnMain.getNom() + ".") ;
        } else {
                System.out.println (nom + " ne possède pas l'arme" + nomArme + ".") ;     
        }
    }

    @Override
    public String toString() {
        String info = nom + " (Vie = " + niveauVie + ")";

        if (armeEnMain != null) {
            info += " | Arme en main : " + armeEnMain.toString();
        } else {
            info += " | Arme en main : aucune";
        }

        return info;
    }
}