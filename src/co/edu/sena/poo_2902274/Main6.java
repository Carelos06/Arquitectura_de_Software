package co.edu.sena.poo_2902274;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.println("------------------Punto 6------------------");
        System.out.println("Area y volumen de un cilindro");
        System.out.println("Ingrese cuantos euros quiere combertir a dolares");

        Scanner src = new Scanner(System.in);
        double euros = src.nextDouble();


        double resultado = euros * 1.08;

        System.out.printf(euros + " euros combertidos a dolares son: " + resultado + " dolares.");
    }
}