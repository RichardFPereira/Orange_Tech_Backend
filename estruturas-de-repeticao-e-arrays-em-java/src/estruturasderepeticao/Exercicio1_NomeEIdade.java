package estruturasderepeticao;/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
 */

import java.util.Scanner;

public class Exercicio1_NomeEIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        while (true) {
            System.out.println("Digite o nome do aluno: ");
            nome = entrada.next();
            if (nome.equals("0")) {
                break;
            }
            System.out.println("Digite a idade do aluno: ");
            idade = entrada.nextInt();
        }
    }
}