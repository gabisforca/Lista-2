//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente.
//* Data: 16/04/2023


import java.util.Scanner;
public class App {
   
    public static void main(String[] args) {
        
        double a;
        double b;
        double c;

        Scanner teclado = new Scanner (System.in);
        System.out.print ("Digite o primeiro número:");
        a = teclado.nextDouble();
        System.out.print ("Digite o segundo número:");
        b = teclado.nextDouble();
         System.out.print ("Digite o terceiro número:");
        c = teclado.nextDouble();
        teclado.close();

        if(a < b && b < c){
            System.out.print("A ordem crescente dos números é: " + a + ", "  + b + ", " + c);
        }
         if(a < c && c < b){
            System.out.print("A ordem crescente dos números é: " + a + ", "  + c + ", " + b);
        }
         if(b < a && a < c){
            System.out.print("A ordem crescente dos números é: " + b + ", " + a + ", " + c);
       }
        if(c < a && a < b){
            System.out.print("A ordem crescente dos números é: " + c + ", " + a + ", " + b);
        }
         if(c < b && b < a){
            System.out.print("A ordem crescente dos números é: " + c + ", " + b + ", " + a);
        }
         if(b < c && c < a){
            System.out.print("A ordem crescente dos números é: " + b + ", " + c + ", " + a);
        }
        

    }
}
