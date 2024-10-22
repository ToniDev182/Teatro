/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elteatro;

/**
 *
 * @author Antonio Atienza Cano
 */
// Clase principal que representa el Teatro

class Teatro 

{
    private String nombre;
    private String direccion;
    private Funcion[] funciones; // Almacena las funciones del dia 

    // Constructor
    public Teatro(String nombre, String direccion, int cantidadFunciones) 
    
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.funciones = new Funcion[cantidadFunciones];
    }

    // Métodos de consulta y modificación para el nombre del teatro
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre)
    
    {
        this.nombre = nombre;
    }

    // Métodos de consulta y modificación para la dirección del teatro
    public String getDireccion() 
    
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    
    {
        this.direccion = direccion;
    }

    // Métodos para obtener y modificar las funciones del teatro
    public Funcion[] getFunciones()
    
    {
        return funciones;
    }

    public void setFunciones(Funcion[] funciones)
    
    {
        this.funciones = funciones;
    }
}