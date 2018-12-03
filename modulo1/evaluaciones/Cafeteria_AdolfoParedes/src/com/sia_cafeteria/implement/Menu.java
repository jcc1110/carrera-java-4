/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sia_cafeteria.implement;
import com.sia_cafeteria.beans.IMenu;

/**
 *
 * @author Adolfo Paredes
 */
public class Menu implements IMenu{
    Menu(){}
    
    public static void Header(){
        //BIENVENIDA
        System.out.println("Bienvenido al Sistema de Cafeteria");
    }

    public static void Body() {
        System.out.println("Listado de Opciones");
        // Imprimo las opciones
        System.out.println("================");
        System.out.println("Operaciones:");
        System.out.println("A - Listar");
        System.out.println("B - Buscar");
        System.out.println("C - Agregar");
        System.out.println("D - Modificar");
        System.out.println("E - Eliminar");
        System.out.println("F - Salir");
        System.out.print("Opción: ");
    }

    public static void Footer() {
    // Despedida
    System.out.println("Ingrese la Opcion que desea: ");
    }
}
