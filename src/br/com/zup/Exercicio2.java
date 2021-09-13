package br.com.zup;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<Long, Double> listaCandidatos = new HashMap<Long, Double>();

        //variaveis
        long numeroMatricula;
        double notaCandidato;
        int opcaoSelecionada = 0;
        boolean exibicaoMenu = true;

        System.out.println("------Bem-vindo a Lista Canditados VestCode------");

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1- Cadastrar Candidato e Nota.");
            System.out.println("2- Exibir a lista de candidatos.");
            System.out.println("3- Excluir candidato.");
            System.out.println("4- Sair.");
            System.out.println("Digite o número da opção que deseja selecionar:");
            opcaoSelecionada = leitor.nextInt();

            if (opcaoSelecionada == 1) {
                System.out.println("------Cadastrar candidato e nota------");
                System.out.println("Digite o número de matricula do candidato:");
                numeroMatricula = leitor.nextLong();
                System.out.println("Digite a nota do candidato:");
                notaCandidato = leitor.nextDouble();

                listaCandidatos.put(numeroMatricula,notaCandidato);

            } else if (opcaoSelecionada == 2) {

                //exibir lista

            } else if (opcaoSelecionada == 3) {

                //excluir candidato

            } else if (opcaoSelecionada == 4) {

                exibicaoMenu = false;
                System.out.println("Até a proxima!");

            } else {
                System.out.println("Opção selecionada inválida!");
            }


        } while (exibicaoMenu);

    }

}
