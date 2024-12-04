package br.com.mcoder.data.structures.app;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/*
Você deve fazer um programa que leia um valor qualquer e apresente uma
 mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100])
 este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos,
 deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
*/
public class Lesson1 {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        if (x >= 0) {
            if (x < 25.01) {
                System.out.println("Intervalo [0,25]");
            } else if (x < 50) {
                System.out.println("Intervalo [25,50]");
            } else if (x < 75) {
                System.out.println("Intervalo [50,75]");
            } else if (x < 101) {
                System.out.println("Intervalo [75,100]");
            }else{
                System.out.println("Fora de intervalo");
            }
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
