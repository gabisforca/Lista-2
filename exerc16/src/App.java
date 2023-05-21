//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA:942312050
//* Nome do Programa:Faça um programa que solicite ao usuário que digite um número até que ele digite um número menor que 0 (utilize while)
//* Data:30/04/2023 

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        while (numero >= 0){
         System.out.print("Digite um número:"); 
         numero = teclado.nextInt();      
        
}
    System.out.print("Esse número é menor que zero.");
        
    }
}
