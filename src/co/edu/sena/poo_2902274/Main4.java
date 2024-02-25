package co.edu.sena.poo_2902274;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("------------------Punto 4------------------");
        System.out.println("Combertir euros a dolares");
        System.out.println("Ingrese cuantos euros quiere combertir a dolares");

        Scanner src = new Scanner(System.in);
        double euros = src.nextDouble();


        double resultado = euros * 1.08;

        System.out.printf(euros + " euros combertidos a dolares son: " + resultado + " dolares.");
    }
}