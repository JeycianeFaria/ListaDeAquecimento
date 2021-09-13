package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<String, String> cardapio = new HashMap<String,String>();

        String nomeDoPrato;
        String ingredientesDoPrato;
        boolean exibirMenu = true;
        String exemplo;
        int opcaoMenu = 0;

         while (exibirMenu){
             System.out.println("------ Restaurante MataFome ------");
             System.out.println("O que você deseja fazer? ");
             System.out.println("1- Adicionar novo prato?");
             System.out.println("2- Exibir o cardápio do restaurante?");
             System.out.println("3- Excluir prato do cardápio?");
             System.out.println("4- Sair.");
             opcaoMenu = leitor.nextInt();

             if (opcaoMenu == 1){



             }else if(opcaoMenu == 2){

             }else if (opcaoMenu == 3){

             }else if (opcaoMenu == 4){

             }else {
                 System.out.println("Opção selecionada inválida!");
             }

         }

    }

}
