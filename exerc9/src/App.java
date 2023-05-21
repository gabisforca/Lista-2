//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Faça um programa que receba o valor da venda, escolha a condição de pagamento no menu e mostre o total da venda final conforme condições a seguir:Venda a Vista - desconto de 10% Venda a Prazo 30 dias - desconto de 5% Venda a Prazo 60 dias - mesmo preço Venda a Prazo 90 dias - acréscimo de 5% Venda com cartão de débito - desconto de 8% Venda com cartão de crédito - desconto de 7%
//* Data: 16/04/2023


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double valordevenda;
        double formadepagamento;
        double avista;
        double valortotal;
        double prazo30;
        double valortotal1;
        double prazo60;
        double valortotal2;
        double prazo90;
        double cartaodebito;
        double valortotal3; 
        double cartaocredito;
        double valortotal4;
    
    Scanner teclado = new Scanner(System.in);
    System.out.print("Qual o valor da venda? ");
    valordevenda = teclado.nextDouble();
    System.out.println("Qual a forma de pagamento? Digite 1-Avista. 2-A prazo 30 dias. 3-A prazo 60 dias. 4-A prazo 90 dias. 5-Cartão de débito. 6-Cartão de crédito.  ");
    formadepagamento = teclado.nextDouble();


    if (formadepagamento == 1 ){
        avista = valordevenda * 0.1;
        valortotal = valordevenda - avista;
        System.out.print("O valor avista é: " + valortotal);
    }
      if (formadepagamento == 2 ) {
        prazo30 = valordevenda * 0.05;
        valortotal1 = valordevenda - prazo30;
        System.out.print("A prazo em 30 dias é: " + valortotal1);
    }
    if (formadepagamento == 3 ) {
        prazo60 = valordevenda;
        System.out.print("A prazo em 60 dias é: " + prazo60);
    }
    if (formadepagamento == 4 ) { 
        prazo90 = valordevenda * 0.05;
        valortotal2 = valordevenda + prazo90;
        System.out.print("A prazo em 90 dias é: " + valortotal2);}

    if (formadepagamento == 5 ) { 
        cartaodebito = valordevenda * 0.08;
        valortotal3 = valordevenda - cartaodebito;
        System.out.print("Cartão de débito: " + valortotal3);}
    
    if (formadepagamento == 6 ) { 
        cartaocredito = valordevenda * 0.07;
        valortotal4 = valordevenda - cartaocredito;
        System.out.print("Cartão de crédito: " + valortotal4);}

    }
}
