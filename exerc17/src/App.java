//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Faça um programa que imprima os múltiplos negativos de 7,superiores a -1000. (utilize do / while).
//* Data: 21/05/2023


import java.util.Scanner;
public class App {
   
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero = 0;

        do {
            System.out.print(+ numero + "," );
            numero = numero - 7;
            
        }  while (numero >= -1000);
        teclado.close();
    } 
}