//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Faça um programa para imprimir o conceito de um aluno. O conceito é calculado em função da nota do aluno que varia de 0 a 100. As faixas da correlação são mostradas abaixo:Nota Conceito 0 a 49 Insuficiente 50 a 64 Regular 65 a 84 Bom 85 100 Ótimo
//* Data: 16/04/2023


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double nota;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite a nota do aluno de 0 a 100: ");
    nota = teclado.nextDouble();

    if (nota >= 0 && nota <= 49 ){
        System.out.print("Insuficiente");
    }
    if (nota >= 50 && nota <= 64) {
        System.out.print("Regular");
    }

    if(nota >= 65 && nota <= 84 ){
        System.out.print("Bom");
    }
    if (nota >= 85 && nota <=100) {
        System.out.print ("ótimo");
    }
    else {
        System.out.print("Digite uma nota de 0 a 100");
    }
        
        
    }
}

