package br.com.zup;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Map<String,Double> listaDeProdutos = new HashMap<String,Double>();

        //variaveis
        boolean exibirmenu = true;
        double precoProduto;
        int decisaomenu;
        String excluirProduto = "";
        String nomeProduto;
        String produtoParaExcluir;


        System.out.println("\n------Lojinha do João------\n");
        System.out.println("Bem vindo João!");

        while (exibirmenu){

            System.out.println("O que você gostaria de fazer?");
            System.out.println("1- Cadastrar novo produto.");
            System.out.println("2- Exibir todos os produtos cadastrados.");
            System.out.println("3- Excluir produto.");
            System.out.println("4- Sair.");
            decisaomenu = leitor.nextInt();
            leitor.nextLine();



            switch (decisaomenu){
                case 1:
                    //cadastrar produto
                    System.out.println("\n------Cadastrar Novo Produto------\n");
                    System.out.println("Digite o nome do produto: ");
                    nomeProduto = leitor.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    precoProduto = leitor.nextDouble();

                    listaDeProdutos.put(nomeProduto,precoProduto);

                    System.out.println("\nProduto cadastrado com  sucesso!\n");

                    break;

                case 2:
                    //exibir lista de produtos
                    System.out.println("\n------Produtos Cadastrados!-----\n");

                    for (String produtos: listaDeProdutos.keySet()) {

                        System.out.println("Produto: " + produtos + "\t || Valor : R$ " + listaDeProdutos.get(produtos) + "\n");

                    }

                    break;

                case 3:
                    //excluir produtos
                    System.out.println("\n------Excluir Produtos------\n");
                    System.out.println("Digite qual o produto que você quer excluir:");
                    produtoParaExcluir = leitor.nextLine();


                    for (String excluir: listaDeProdutos.keySet()) {
                        if(excluir.equals(produtoParaExcluir)){
                            excluirProduto = produtoParaExcluir;
                            break;
                        }
                    }

                    listaDeProdutos.remove(excluirProduto);

                    System.out.println("\nProduto excluído com sucesso!\n");

                    break;

                case 4:
                    exibirmenu = false;
                    System.out.println("\nAté a proxima!");

                    break;

                default:
                    //numero digitado incorreto
                    System.out.println("\nVocê digitou um valor inválido, digite novamente!\n");

                    break;

            }

        }

    }

}
