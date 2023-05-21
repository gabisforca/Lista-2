//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA:942312050
//* Nome do Programa:Faça um programa que determine o fatorial de um número. Para
//este problema, tem-se como entrada o valor do número do qual
//se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
//fatorial de um número N (N!) é definido conforme a seguir
//(utilize for):
//i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
//* Data:30/04/2023 

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número:"); 
        int n = teclado.nextInt();
        int fatorial = n;
        int i;
        if (n == 0) {
            System.out.print ("O valor do fatorial é 1.");
       }
        for (i = n; i != 1; i--){
         fatorial = fatorial * (i-1);
        }
        System.out.print(fatorial);      
             
    }
}