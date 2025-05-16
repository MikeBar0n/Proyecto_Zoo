/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Zoologico {
    
    private String nombre;
    private String ciudad;
    private String pais;
    private double tamano;
    private double presupuesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    

    public Zoologico(String nombre, String ciudad, String pais, double tamano, double presupuesto) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.tamano = tamano;
        this.presupuesto = presupuesto;
    }
    
    public String toFileString() {
        return nombre + ";" + ciudad + ";" + pais + ";" + tamano + ";" + presupuesto;
    }

    public static Zoologico fromFileString(String linea) {
        String[] datos = linea.split(";");
        return new Zoologico(
            datos[0], datos[1], datos[2],
            Double.parseDouble(datos[3]),
            Double.parseDouble(datos[4])
        );
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Ciudad: " + ciudad + " | País: " + pais +
               " | Tamaño: " + tamano + "m² | Presupuesto: $" + presupuesto;
    }
}
