package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<String, String> cardapio = new HashMap<String,String>();

        boolean exibirMenu = true;
        int opcaoMenu = 0;
        String excluir;
        String excluirPrato;
        String exemplo;
        String ingredientesDoPrato = "";
        String nomeDoPrato = "";

         while (exibirMenu){

             System.out.println("\n------ Restaurante MataFome ------\n");
             System.out.println("O que você deseja fazer? ");
             System.out.println("1- Adicionar novo prato?");
             System.out.println("2- Exibir o cardápio do restaurante?");
             System.out.println("3- Excluir prato do cardápio?");
             System.out.println("4- Sair.");
             opcaoMenu = leitor.nextInt();
             leitor.nextLine();

             if (opcaoMenu == 1){

                 System.out.println("\nCadastrar novos pratos\n");
                 System.out.println("Digite o nome do Prato");
                 nomeDoPrato = leitor.nextLine();
                 System.out.println("Digite os ingrediente do Prato separados por ','");
                 ingredientesDoPrato = leitor.nextLine();

                 cardapio.put(nomeDoPrato, ingredientesDoPrato);

                 System.out.println("\nPrato cadastrado com sucesso!\n");


             }else if(opcaoMenu == 2){

                for (String exibircardapio:cardapio.keySet()){
                    System.out.println("\nPrato: " + exibircardapio + "\t || Ingredientes: " + cardapio.get(exibircardapio));
                }

             }else if (opcaoMenu == 3){

                 System.out.println("Digite o nome do prato que deseja excluir: ");
                 excluirPrato = leitor.nextLine();

                 for (String excluirPratoCardapio:cardapio.keySet()){
                     if (excluirPratoCardapio.equals(excluirPrato)){
                         excluir = excluirPrato;
                     }
                 }

                 cardapio.remove(excluirPrato);

                 System.out.println("\nPrato excluído com sucesso!\n");

             }else if (opcaoMenu == 4){

                exibirMenu = false;
                System.out.println("Até a proxima!");

             }else {
                 System.out.println("Opção selecionada inválida!");
             }

         }

    }

}
