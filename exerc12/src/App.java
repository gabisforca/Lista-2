//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Faça um programa que exiba todos os números pares a partir de 0 até que encontre um múltiplo de 7 (utilize do/while)
//* Data: 21/05/2023


import java.util.Scanner;
public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        
         do {
            System.out.print( + numero + "," );
            numero = numero + 1;
            numero ++;
            
        }  while (numero < 7);
    } 
}