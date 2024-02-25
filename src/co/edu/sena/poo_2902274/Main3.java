package co.edu.sena.poo_2902274;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("------------------Punto 3------------------");
        System.out.println("Elevar un numero al cuadrado");
        System.out.println("Ingrese el numero que quiere elevar");

        Scanner src = new Scanner(System.in);
        double num1 = src.nextDouble();

        double resultado = num1 * num1;

        System.out.printf("El resultado " + num1 + " al cuadrado es: " + resultado);
    }
}