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


        System.out.println("------Lojinha do João------");
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
                    System.out.println("------Cadastrar Novo Produto------");
                    System.out.println("Digite o nome do produto.");
                    nomeProduto = leitor.nextLine();
                    System.out.println("Digite o preço do produto.");
                    precoProduto = leitor.nextDouble();

                    listaDeProdutos.put(nomeProduto,precoProduto);


                    break;
                case 2:
                    //exibir lista de produtos
                    System.out.println("------Produtos Cadastrados!-----");

                    for (String produtos: listaDeProdutos.keySet()) {

                        System.out.println("Produto: " + produtos + " Valor : R$ " + listaDeProdutos.get(produtos));

                    }

                    break;
                case 3:
                    //excluir produtos
                    System.out.println("------Excluir Produtos------");
                    System.out.println("Digite qual o produto que você quer excluir:");
                    produtoParaExcluir = leitor.nextLine();


                    for (String excluir: listaDeProdutos.keySet()) {
                        if(excluir.equals(produtoParaExcluir)){
                            excluirProduto = produtoParaExcluir;
                            break;
                        }
                    }

                    listaDeProdutos.remove(excluirProduto);

                    break;
                case 4:
                    exibirmenu = false;
                    System.out.println("Até a proxima!");

                    break;
                default:
                    //numero digitado incorreto
                    System.out.println("Você digitou um valor inválido, digite novamente!");
                    break;
            }

        }
    }

}
