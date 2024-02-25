package co.edu.sena.poo_2902274;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        System.out.println("------------------Punto 7------------------");
        System.out.println("Longitud de un a circunferencia y su area");
        System.out.println("Ingrese el radio de su circunferencia en centimetros");

        Scanner src = new Scanner(System.in);
        double radio = src.nextDouble();

        double longitud = radio * 2;

        double area = (Math.PI*(radio*radio));

        System.out.println("La longitud de su circunferencia es: " + longitud + "cm.");

        System.out.println("El area de su circunferencia es: " + area + "cm2.");
    }
}