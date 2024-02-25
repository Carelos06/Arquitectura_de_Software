package co.edu.sena.poo_2902274;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("------------------Punto 5------------------");
        System.out.println("Area y perimetro de un cuadrado");
        System.out.println("Ingrese la medida de un lado del cuadrado en centimetros");

        Scanner src = new Scanner(System.in);
        double lado = src.nextDouble();


        double area = lado * lado;

        double perimetro = lado * 4;

        System.out.println("El area de su cuadrado es de: " + area + "cm");
        System.out.println("El perimetro de su cuadrado es de " + perimetro + "cm");
    }
}