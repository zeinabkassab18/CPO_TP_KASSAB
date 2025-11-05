/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_kassab;

/**
 *
 * @author kassab10
 */
public class TP2_manip_KASSAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette T1 = new Tartiflette(500);
        Tartiflette T2 = new Tartiflette(600);
        Tartiflette T3 = T2;

        System.out.println("nb de calories de T2 : " + T2.nbCalories);
        System.out.println("nb de calories de T3 : " + T3.nbCalories);
        
        // Inverser 
        Tartiflette temp = T1;
        T1 = T2;
        T2 = temp;

        System.out.println("\nAprès échange :");
        System.out.println("Calories de T1 : " + T1.nbCalories);
        System.out.println("Calories de T2 : " + T2.nbCalories);
        
        
        // Creation tableau 10 colonne 
        Moussaka[] tabMoussaka = new Moussaka[10];

        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(300 + i * 10);
        }

        System.out.println("\nAffichage des Moussaka :");
        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka n°" + (i + 1) + " : " + tabMoussaka[i].nbCalories + " kcal");
        }
    }
}
        

