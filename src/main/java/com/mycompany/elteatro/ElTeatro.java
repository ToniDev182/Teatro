/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elteatro;

/**
 *
 * @author Antonio Atienza Cano
 */
public class ElTeatro 
{
// Clase principal para probar el sistema
    public static void main(String[] args) 
    {
        // Crear un teatro con nombre y dirección
        
        Teatro miTeatro = new Teatro("Teatrillo ", "Calle del programador 567", 4);

        // Crear funciones y asignarlas al teatro
        
        Funcion funcion1 = new Funcion("Funcion 1", 15.0);
        Funcion funcion2 = new Funcion("Funcion 2", 20.0);
        Funcion funcion3 = new Funcion("Funcion 3", 18.5);
        Funcion funcion4 = new Funcion("Funcion 4", 25.0);

        miTeatro.getFunciones()[0] = funcion1;
        miTeatro.getFunciones()[1] = funcion2;
        miTeatro.getFunciones()[2] = funcion3;
        miTeatro.getFunciones()[3] = funcion4;

        // Mostrar información del teatro y sus funciones
        System.out.println("Información del Teatro:");
        System.out.println("Nombre: " + miTeatro.getNombre());
        System.out.println("Dirección: " + miTeatro.getDireccion());

        System.out.println("\nFunciones del Día:");
        for (Funcion funcion : miTeatro.getFunciones()) {
            System.out.println("Nombre: " + funcion.getNombre() + ", Precio: $" + funcion.getPrecio());
        }
    }
}