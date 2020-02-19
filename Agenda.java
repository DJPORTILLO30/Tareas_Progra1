package com.curso.progra1;

public class Agenda {
    public static void main(String[] args) {
        String agemda[][] = {{"Nombre","Email","Telefono"},{"Danilo Portillo","damiloportillo200030@gmail.com","1234567"}};
        for (int i = 0 ; i<2 ; i++){
            for (int o = 0 ; o<3 ; o++){
                System.out.print(agemda[i][o] + " ");
            }
            System.out.println();
        }
    }
}
