//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Escreva um programa que, dado um número positivo digitado pelo o usuário mostre a tabuada de todos os números de 1 até o número digitado. (utilize for)
//* Data: 21/05/2023

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        int numero = Scanner.nextInt();
        
        if (numero <= 0) {
            System.out.println("Digite um número positivo.");
        } else {
                for (int j = 1; j <= numero; j++) {
                    int multiplicação = numero * j;
                    System.out.println(numero + " x " + j + " = " + multiplicação);
                }
                System.out.println();
            }
        }
    }
