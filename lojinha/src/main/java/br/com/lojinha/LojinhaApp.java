package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {

        /* para utilizar uma classe através de outra classe é necessário importa-la */

        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);

        /* valores aos atributos */

        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);

        meuProduto.setTamanho(Tamanho.PEQUENO);

        List<String> itensInclusos = new ArrayList<>(); // lista//
        itensInclusos.add("2 Controles");
        itensInclusos.add("3 Jogos");
        itensInclusos.add("2 cabos de energia");
        meuProduto.setItensInclusos(itensInclusos);

        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getTamanho());

        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());


    }

}

