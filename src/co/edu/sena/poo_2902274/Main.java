package co.edu.sena.poo_2902274;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("------------------Punto 1------------------");
        System.out.println("Calcular area de un triangulo");
        System.out.println("Ingrese la base del trinagulo");

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();

        System.out.println("Ingrese la altuda del triangulo");
        double altura = src.nextDouble();

        double resultado = (base * altura) / 2;
 
        System.out.printf("El area del triangulo es: " + resultado);
    }
}