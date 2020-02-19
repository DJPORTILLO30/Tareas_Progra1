package com.curso.progra1;


import java.util.Scanner;

public class Inicio_de_sesion {
    public static void main(String[] args) {
        System.out.print("Ingrese la contrasña correcta: ");
        final String Palabra_Secreta = "Batman123";
        Scanner leer_teclado = new Scanner(System.in);
        String usuario = leer_teclado.nextLine();
        if (usuario.equals(Palabra_Secreta)){
            System.out.println("Bienvenido");
        }
        else {
            System.out.println("ERROR");
        }
    }
}
