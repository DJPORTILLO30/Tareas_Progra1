package com.curso.progra1;

import java.util.Scanner;

public class Compras {
    public static void main(String[] args) {
        Scanner Lectura_de_Teclado = new Scanner(System.in);
        System.out.println("Bievenido al supermecado el ahorro" + '\n' +
                "puede llevar un maximo de 5 productos");
        String carrito[] = new String[5];
        int maximo=0;
        while (maximo<=4){
            System.out.println("1.Huevos" + "\n" + "2.Carne"+ "\n" + "3.Maiz" + "\n" + "4.Cereal" + "\n" + "5.Tomate"+ "\n" + "6.Pescado");
            int seleccion = 0;
            System.out.println("Que producto desea: ");
            seleccion = Lectura_de_Teclado.nextInt();
            switch (seleccion){
                case 1:
                    carrito[maximo] = "Huevos";
                    maximo++;
                    break;
                case 2:
                    carrito[maximo] = "Carne";
                    maximo++;
                    break;
                case 3:
                    carrito[maximo] = "Maiz";
                    maximo++;
                    break;
                case 4:
                    carrito[maximo] = "Ceral";
                    maximo++;
                    break;
                case 5:
                    carrito[maximo] = "Tomate";
                    maximo++;
                    break;
                case 6:
                    carrito[maximo] = "Pescado";
                    maximo++;
                    break;
                default:
                    System.out.println("ese producto no existe");
                    maximo++;
                    break;
            }
        }
        System.out.println("Sus productos son:");
        for (int i=0;i<5;i++){
            System.out.println(carrito[i]);
        }
    }
}
