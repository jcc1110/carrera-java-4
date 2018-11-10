package e_tablamultiplicar;

import java.util.Scanner;

public class E_TablaMultiplicar {
    public static void main(String[] args) {
        // Declarando variable entera a solicitar al usuario
        int numero;
        
        // Instanciando la clase Scanner
        Scanner scan = new Scanner(System.in);

        // Solicito el número al usuario
        System.out.print("Ingrese un número: ");
        
        // Asigno el valor ingresado por el usuario a la variable "numero"
        numero = scan.nextInt();
        
        // Aplico una estructra iterativa "For"
        for (int i=1; i<=10; i++) {
            System.out.println(numero +"x"+ i +"="+ numero*i);
        } 
    } 
}
