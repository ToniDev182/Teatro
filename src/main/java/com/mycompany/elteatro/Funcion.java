/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elteatro;

/**
 *
 * @author Antonio Atienza Cano
 */
// Clase que representa una función en el teatro

class Funcion 

{  
    private String nombre;
    private double precio;

    // Constructor
    
    public Funcion(String nombre, double precio) 
    
    {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos de consulta y modificación para el nombre de la función
    
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    // Métodos de consulta y modificación para el precio de la función
    
    public double getPrecio() 
    
    {
        return precio;
    }

    public void setPrecio(double precio) 
    
    {
        this.precio = precio;
    }
}