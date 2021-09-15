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
        boolean exibicaoMenu = true;
        double notaCandidato = 0;
        int opcaoSelecionada = 0;
        long excluirCandidato = 0;
        long matriculaCandidato = 0;
        long numeroMatricula = 0;

        System.out.println("\n------Bem-vindo a Lista Canditados VestCode------\n");

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1- Cadastrar Candidato e Nota.");
            System.out.println("2- Exibir a lista de candidatos.");
            System.out.println("3- Excluir candidato.");
            System.out.println("4- Sair.");
            System.out.println("Digite o número da opção que deseja selecionar:");
            opcaoSelecionada = leitor.nextInt();

            if (opcaoSelecionada == 1) {
                System.out.println("\n------Cadastrar candidato e nota------\n");
                System.out.println("Digite o número de matricula do candidato:");
                numeroMatricula = leitor.nextLong();
                System.out.println("Digite a nota do candidato:");
                notaCandidato = leitor.nextDouble();

                listaCandidatos.put(numeroMatricula,notaCandidato);

                System.out.println("\nCandidato cadastrado com sucesso!\n");



            } else if (opcaoSelecionada == 2) {

                System.out.println("\n------Lista de Candidatos e Notas------\n");

                for (Long canditadosCadastrados: listaCandidatos.keySet()) {
                    System.out.println("Matricula: " + canditadosCadastrados + "\t || Nota: " + listaCandidatos.get(canditadosCadastrados));
                }

            } else if (opcaoSelecionada == 3) {

                System.out.println("Digite o número de matricula que deseja excluir:");
                matriculaCandidato = leitor.nextLong();

                for (Long excluirMatricula: listaCandidatos.keySet()) {
                    if (excluirMatricula.equals(matriculaCandidato)){
                        excluirCandidato = matriculaCandidato;
                        break;
                    }
                }

                listaCandidatos.remove(excluirCandidato);

                System.out.println("\nCandidato excluído com sucesso!\n");

            } else if (opcaoSelecionada == 4) {

                exibicaoMenu = false;
                System.out.println("Até a proxima!");

            } else {
                System.out.println("\nOpção selecionada inválida!\n");
            }

        } while (exibicaoMenu);

    }

}
