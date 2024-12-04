package br.com.mcoder.data.structures.app;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double raio = (double) (x + y) / 3;
        double pi = Math.PI;
        double area = pi * raio;

        System.out.println("Soma: " + (x + y));
        System.out.println("Area: " + (area));

    }
}
