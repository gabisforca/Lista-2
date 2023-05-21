//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Elabore um programa que lê dois valores A e B e os escreve com a mensagem: “São múltiplos” ou “Não são múltiplos”.
//* Data: 21/05/2023


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

        if(a % b == 0 || b % a == 0 ){
            System.out.print("São múltiplos");
        }
        else {
            System.out.print("Não são múltiplos");
        }

    }
}

