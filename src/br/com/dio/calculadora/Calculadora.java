package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtracao = subtracao(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("A soma é: " + somar);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicação é: " + multiplicar);
        System.out.println("A divisão é: " + dividir);
    }

    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtracao(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
        return a / b;
}

}
