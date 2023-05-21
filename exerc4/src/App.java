//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar e se épositivo ou negativo.
//* Data: 16/04/2023



import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        double numero;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um número:");
    numero = teclado.nextDouble();

    if (numero % 2 == 0){
        System.out.print("Esse número é par");
    }
    else {
        System.out.print("Esse número é ímpar");
    }

    if(numero > 0 ){
        System.out.print(" e positivo");
    }
    else {
        System.out.print (" e negativo");
    }
        
        
    }
}
