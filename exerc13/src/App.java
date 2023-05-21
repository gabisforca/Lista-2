//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA:942312050
//* Nome do Programa:Faça um programa que some os números de 1 a 100 e imprima somente o valor total da soma
//* Data:30/04/2023 

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;
        int i;
        i = 1;
        while (i <=100){  
            soma = i + soma; 
            i = i + 1;           
        teclado.close();
}
        System.out.print(soma);
    }
}
