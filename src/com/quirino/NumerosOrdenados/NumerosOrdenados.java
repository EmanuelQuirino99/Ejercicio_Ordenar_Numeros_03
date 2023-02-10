package com.quirino.NumerosOrdenados;


import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("Ingresa primer número ");
        a = sc.nextInt();
        System.out.print("Ingresa segundo número ");
        b = sc.nextInt();
        System.out.print("Ingresa tercer número ");
        c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("El número mayor es: " + a);
        } if (b > c) {
            System.out.println("El número intermedio es: " + b);
            System.out.println("El número menor es: " + c);
        } else {
            System.out.println("El número mayor es; " + a);
            System.out.println("El número intermedio es; " + b);
            System.out.println("El número menor es; " + c );

        }

        {


        }

    }
}
