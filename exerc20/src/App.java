//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA:942312050
//* Nome do Programa:Escreva um programa que, dada a carga máxima de um elevador e
//a quantidade máxima de pessoas digitadas pelo usuário, leia o
//peso de cada pessoa, também digitada pelo usuário, que entra
//no elevador até que a carga máxima seja atingida ou o número
//máximo de pessoas seja atingido (utilize do / while).
//* Data:30/04/2023

import java.util.Scanner;
public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a carga máxima do elevador:");
        int cargamaxima = teclado.nextInt();
        System.out.print("Digite a quantidade de pessoas máximas:");
        int pessoamaxima = teclado.nextInt(); 
        int quantidadepessoa = 0;
        int cargaatual = 0;

        do {
            System.out.print("Digite o peso de cada pessoa: ");
            int peso = teclado.nextInt();
            quantidadepessoa ++;
            cargaatual = cargaatual + peso;
            
        }  while (quantidadepessoa < pessoamaxima && cargaatual < cargamaxima);

      System.out.print( "Você atingiu a carga/pessoa máxima");
           
    } 
}