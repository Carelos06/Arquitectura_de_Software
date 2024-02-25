package co.edu.sena.poo_2902274;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("------------------Punto 8------------------");
        System.out.println("Promedio de tres numeros");
        System.out.println("Ingrese el primer numero");

        Scanner src = new Scanner(System.in);
        double num1 = src.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double num2 = src.nextDouble();

        System.out.println("Ingrese el tercer numero");
        double num3 = src.nextDouble();

        double promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio de " + num1 + ", " + num2 + " y " + num3 + " es: " + promedio);
    }
}