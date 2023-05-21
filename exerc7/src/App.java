//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa: Faça um programa calcula o total de uma hospedagem em um hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:R$ 5.50 por diária, se o número de diárias for maior que 15;R$ 6.00 por diária, se o número de diárias for igual a 15;R$ 8.00 por diária, se o número de diárias for menor que 15.
//* Data: 16/04/2023


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double diaria;
        double hospedagem;
        double total;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Quantas diárias são? ");
    diaria = teclado.nextDouble();
    hospedagem = diaria * 60;

    if (diaria >= 0 && diaria < 15 ){
        total = (diaria * 8) + hospedagem;
        System.out.print("O valor da hospedagem é:" + total);
    }
    if (diaria == 15) {
        total = (diaria * 6) + hospedagem;
        System.out.print("O valor da hospedagem é: " + total);
    }

    if(diaria > 15  ){
        total = (diaria * 5.5) + hospedagem;
        System.out.print("O valor da hospedagem é: " + total);
    
    }
   
        
        
    }
}