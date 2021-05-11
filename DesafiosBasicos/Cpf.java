/* < Desafio 2 >
        Elabore um programa que possuas as características abaixo:

        Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
        Imprima os quatro grupos numéricos, sendo um valor por linha.
        Entrada
        A entrada consiste vários arquivos de teste e cada um possuindo uma linha com formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros.

        Saída
        Para cada arquivo da entrada, tem que ter um arquivo de saída com quatro linhas, e em cada linha um número inteiro de acordo com procedimento 2 descrito no Desafio. Confira o exemplo abaixo: */

import java.util.Scanner;

public class CPF {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] cpf = entrada.nextLine().split("[.\\-]");

        for (int i = 0; i < 4 ; i++) {
            System.out.printf("%s\n",cpf[i]);
        }
    }
    
}