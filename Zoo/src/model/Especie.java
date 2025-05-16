/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Especie {
    
    private String nombreVulgar;
    private String nombreCientifico;
    private String  Familia;

    public Especie(String nombreVulgar, String nombreCientifico, String Familia) {
        this.nombreVulgar = nombreVulgar;
        this.nombreCientifico = nombreCientifico;
        this.Familia = Familia;
        
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
        return Familia;
    }

    public void setFamilia(String Familia) {
        this.Familia = Familia;
    }
    
}
