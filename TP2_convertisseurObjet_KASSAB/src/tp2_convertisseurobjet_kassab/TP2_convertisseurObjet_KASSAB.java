/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_kassab;

/**
 *
 * @author kassab10
 */
public class TP2_convertisseurObjet_KASSAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur c1 = new Convertisseur();
        Convertisseur c2 = new Convertisseur();

        float k = c1.CelciusVersKelvin(25f);
        float f = c1.CelciusVersFarenheit(0f);
        System.out.println("25°C -> " + k + " K");
        System.out.println("0°C -> " + f + " °F");
        System.out.println(c1);  

        float c = c2.FarenheitVersCelcius(212f);
        float f2 = c2.KelvinVersFarenheit(300f);
        System.out.println("212°F -> " + c + " °C");
        System.out.println("300 K -> " + f2 + " °F");
        System.out.println(c2);  
    }
}
    
    
