//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Faça um programa que leia dois números A e B e imprima o maior deles.
//* Data: 16/04/2023



import java.util.Scanner;
public class App {
   
    public static void main(String[] args) {
        
        double a;
        double b;

        Scanner teclado = new Scanner (System.in);
        System.out.print ("Digite um número:");
        a = teclado.nextDouble();
        System.out.print ("Digite outro número:");
        b = teclado.nextDouble();

        if(a > b){
            System.out.print("O maior número é:" + a);
        }
        else {
            System.out.print("O maior número é:" + b);
        }

    }
}
