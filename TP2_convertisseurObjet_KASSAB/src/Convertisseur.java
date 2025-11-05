/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kassab10
 */
public class Convertisseur {
    int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public float CelciusVersKelvin(float tempC) {
        nbConversions++;
        return tempC + 273.15f;
    }

    public float KelvinVersCelcius(float tempK) {
        nbConversions++;
        return tempK - 273.15f;
    }

    public float FarenheitVersCelcius(float tempF) {
        nbConversions++;
        return (tempF - 32) * 5f / 9f;
    }

    public float CelciusVersFarenheit(float tempC) {
        nbConversions++;
        return tempC * 9f / 5f + 32;
    }

    public float FarenheitVersKelvin(float tempF) {
        nbConversions++;
        return (tempF - 32) * 5f / 9f + 273.15f;
    }

    public float KelvinVersFarenheit(float tempK) {
        nbConversions++;
        return (tempK - 273.15f) * 9f / 5f + 32;
    }

    // méthode toString demandée dans le texte
    @Override
    public String toString() {
        return "nb de conversions : " + nbConversions;
    }
}



    
    
    

