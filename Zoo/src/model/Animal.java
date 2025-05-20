/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author USUARIO
 */
public class Animal {
    
    private int id;
    private Especie especie;
    private String sexo;
    private int anioNacimiento;
    private String paisOrigen;
    private String continente;
    private String nombreZoologico;

    public Animal(int id, Especie especie, String sexo, int anioNacimiento, String paisOrigen, String continente, String nombreZoologico) {
        this.id = id;
        this.especie = especie;
        this.sexo = sexo;
        this.anioNacimiento = anioNacimiento;
        this.paisOrigen = paisOrigen;
        this.continente = continente;
        this.nombreZoologico = nombreZoologico;
    }

    public int getId() {
        return id;
    }

    public Especie getEspecie() {
        return especie;
    }

    public String getSexo() {
        return sexo;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getContinente() {
        return continente;
    }

    public String getNombreZoologico() {
        return nombreZoologico;
    }

   public String toFileString() {
        return id + ";" +
               especie.getNombreVulgar() + ";" +
               especie.getNombreCientifico() + ";" +
               especie.getFamilia() + ";" +
               sexo + ";" +
               anioNacimiento + ";" +
               paisOrigen + ";" +
               continente + ";" +
               nombreZoologico;
    }
   public static Animal fromFileString(String linea) {
        String[] datos = linea.split(";");
        Especie especie = new Especie(datos[1], datos[2], datos[3]);
        return new Animal(
            datos[0], especie, datos[4], Integer.parseInt(datos[5]),
            datos[6], datos[7], datos[8]
        );
    }
   @Override
    public String toString() {
        return id + " - " + especie.getNombreCientifico() +
               " (" + sexo + ", " + anioNacimiento + ", " + paisOrigen + ")";
    }
    
}
