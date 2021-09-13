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
        long numeroMatricula = 0;
        double notaCandidato = 0;
        int opcaoSelecionada = 0;
        boolean exibicaoMenu = true;
        long matriculaCandidato = 0;
        long excluirCandidato = 0;

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

                System.out.println("Candidato cadastrado com sucesso!");



            } else if (opcaoSelecionada == 2) {

                System.out.println("------Lista de Candidatos e Notas------");

                for (Long canditadosCadastrados: listaCandidatos.keySet()) {
                    System.out.println("Matricula: " + canditadosCadastrados + " Nota: " + listaCandidatos.get(canditadosCadastrados));
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

            } else if (opcaoSelecionada == 4) {

                exibicaoMenu = false;
                System.out.println("Até a proxima!");

            } else {
                System.out.println("Opção selecionada inválida!");
            }

        } while (exibicaoMenu);

    }

}
