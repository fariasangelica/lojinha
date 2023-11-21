package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {

        /* para utilizar uma classe através de outra classe é necessário importa-la */

        Produto meuProduto = new Produto();

        /* valores aos atributos */

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho(Tamanho.PEQUENO);

        List<ItemIncluso> itensInclusos = new ArrayList<>(); // lista//

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);

        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Jogo", 3);

        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Cabo de Energia", 2);

        itensInclusos.add(terceiroItemIncluso);


        meuProduto.setItensInclusos(itensInclusos);
        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getValor());

        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(1).getNome());
        System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(2).getNome());
        System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());

        // Laços
        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());



        }

    }
}







