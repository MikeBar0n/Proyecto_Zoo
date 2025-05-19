/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Especie implements Comparable<Especie> {    
   
    
    private String nombreVulgar;
    private String nombreCientifico;
    private String familia;

    public Especie(String nombreVulgar, String nombreCientifico, String familia) {
        this.nombreVulgar = nombreVulgar;
        this.nombreCientifico = nombreCientifico;
        this.familia = familia;
        
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
    
    @Override
    public String toString() {
        return nombreCientifico + " (" + nombreVulgar + ") - Familia: " + familia;
    }

    public String toFileString() {
        return nombreVulgar + ";" + nombreCientifico + ";" + familia;
    }

    public static Especie fromFileString(String linea) {
        String[] datos = linea.split(";");
        return new Especie(datos[0], datos[1], datos[2]);
    }

    @Override
    public int compareTo(Especie otra) {
        return this.nombreCientifico.compareToIgnoreCase(otra.nombreCientifico);
    }
    
}
