//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA:942312050
//* Nome do Programa:Faça um programa que preencha com zeros todas as posições de um vetor de tamanho 50 
//* Data:30/04/2023


public class App {
   
    public static void main(String[] args) throws Exception {
        int [] vetor = new int [50];
        int i;
        for (i = 0; i < 50; i++){
            vetor [i] = 0;
        }
        for (i = 0; i < 50; i++){
            System.out.println("vetor posição " + i + " valor :" + vetor[i]);
        }
           
    } 
}
