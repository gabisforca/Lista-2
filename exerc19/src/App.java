//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA:942312050
//* Nome do Programa:Um determinado gás duplica seu volume a cada segundo. Dada um
//volume inicial, em centímetros cúbicos, digitado pelo usuário
//faça um programa que determine o tempo necessário para que
//esse volume se torne maior que 1000 centímetros cúbicos.
//(utilize while)
//* Data:30/04/2023

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o volume inicial em centimetros cúbicos:"); 
        int cm = teclado.nextInt();
        int segundo = 0 ;
       
        while (cm <= 1000){
            cm = cm * 2; 
            segundo++;   
        }
        System.out.print(segundo); 
        teclado.close();    
    } 
}