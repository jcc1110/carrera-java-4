package com.main;
import java.util.Scanner;
import com.operation.FileControl;
import com.operation.UserAndDateControl;

public class EntryPoint {
    public static void main(String[] args) {
        // Clases necesarias
        Scanner scan = new Scanner(System.in);
        UserAndDateControl uad = new UserAndDateControl();
        FileControl fc = new FileControl();
        
        // Solicitando el nombre del usuario
        System.out.println("Bienvenido/a al banco XYZ");
        System.out.print("Introduzca su nombre: ");
        uad.setUserName(scan.nextLine());
        
        // Saludando al usuario
        System.out.println("=========================");
        System.out.println(uad.getMessageForUser());
        
        // Estableciendo la ruta del archivo, la cual es relativa al directorio actual del proyecto
        fc.setPathFile("./movimientos.txt");
        
        // Leyendo la información del archivo
        System.out.println("Sus movimientos bancarios son:");
        fc.readContent().stream().forEach(System.out::println);
    }
}
