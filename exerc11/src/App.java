//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA:942312050
//* Nome do Programa:Faça um programa que imprima todos os números pares de 1 a 100 na ordem inversa
//* Data:30/04/2023 

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int numero;
        numero = 100;
        while (numero >= 2){
            System.out.print(numero + "," );    
        numero = numero - 2;
        teclado.close();
}
    }
}

