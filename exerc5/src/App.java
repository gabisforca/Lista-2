//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA: 942312050
//* Nome do Programa:Faça um programa que leia o nome, o sobrenome, a idade, em anos, e a naturalidade (cidade de nascimento) de uma pessoa.
//Depois, o programa deve dar a seguinte opção “Deseja visualizar dados completos?”. Se o caractere digitado pelo usuário for ‘S’ o programa deve imprimir na tela Nome,Sobrenome, idade e naturalidade. Se o caractere digitado pelo usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se o caractere não for nenhuma das outras opções acima o programa deve imprimir “Digitação errada. Tente Novamente”.
//* Data: 16/04/2023



import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        String nome;
        String sobrenome;
        int idade;
        String naturalidade;
        char resposta;
        

    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual o nome? ");
    nome = teclado.next();
    System.out.println("Qual o sobrenome? ");
    sobrenome = teclado.next();
    System.out.println("Qual a idade? ");
    idade = teclado.nextInt();
    System.out.println("Qual a naturalidade (cidade de nascimento) ? ");
    naturalidade = teclado.next();
    System.out.println("Deseja visualizar dados completos? Digita S para sim e N para não ");
    resposta = (char)System.in.read();
    teclado.close();

    if (resposta == 'S') {
        System.out.print ( "Os dados são: " + nome + " " + sobrenome + ", " + idade + " ," + naturalidade);
    }
    if (resposta == 'N') {
        System.out.print ("Os dados são: " + nome + "," + idade);
    }
    else {
        System.out.print("Digitação errada. Tente novamente.");
    }

    
    }
     
        
    }
