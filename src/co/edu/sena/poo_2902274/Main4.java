package co.edu.sena.poo_2902274;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("------------------Punto 4------------------");
        System.out.println("Sumar dos numeros");
        System.out.println("Ingrese el primer numero a sumar");

        Scanner src = new Scanner(System.in);
        double num1 = src.nextDouble();

        System.out.println("Ingrese el segundo numero a sumar");
        double num2 = src.nextDouble();

        double resultado = num1 + num2;

        System.out.printf("El resultado de la suma es: " + resultado);
    }
}