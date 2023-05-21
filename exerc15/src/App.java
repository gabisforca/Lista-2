//* Nome do Aluno: Gabriela Sforça Lourenço
//* RA:942312050
//* Nome do Programa:Faça um programa que preencha com zeros todas as posições de uma matriz com 10 linha e 10 colunas
//* Data:30/04/2023


public class App {
   
    public static void main(String[] args) throws Exception {
        int [][]matriz = new int [10][10];
        int i,j;
        for (i = 0; i < 10; i++) {
        for (j = 0; j < 10; j++) {
        matriz[i][j] = 0;
        System.out.println("matriz posição " + i + " "  + j + " valor :" + matriz [i][j]);
 }
}
       
    } 
}