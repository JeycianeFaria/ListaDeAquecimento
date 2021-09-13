package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<String,Double> listaDeProdutos = new HashMap<String,Double>();

        //variaveis
        String nomeProduto;
        double precoProduto;
        int decisaomenu;
        boolean exibirmenu = true;

        System.out.println("------Lojinha do João------");
        System.out.println("Bem vindo João!");

        while (exibirmenu){

            System.out.println("O que você gostaria de fazer?");
            System.out.println("1- Cadastrar novo produto.");
            System.out.println("2- Exibir todos os produtos cadastrados.");
            System.out.println("3- Excluir produto.");
            System.out.println("4- Sair.");
            decisaomenu = leitor.nextInt();



            switch (decisaomenu){
                case 1:
                    //cadastrar produto
                    System.out.println("------Cadastrar Novo Produto------");
                    System.out.println("");


                    break;
                case 2:
                    //exibir lista de produtos
                    System.out.println("------Produtos Cadastrados!-----");


                    break;
                case 3:
                    //excluir produtos
                    System.out.println("------Excluir Produtos------");


                    break;
                case 4:
                    exibirmenu = false;
                    System.out.println("Até a proxima!");

                    break;
                default:
                    //numero digitado incorreto
                    break;
            }

        }
    }

}
