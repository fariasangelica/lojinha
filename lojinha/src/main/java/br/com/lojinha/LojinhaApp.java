package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {

        /* para utilizar uma classe através de outra classe é necessário importa-la */

        Produto meuProduto = new Produto ();

        /* valores aos atributos */

        meuProduto.nome = "Play Station 4";
        meuProduto.valor = 4999.99;
        meuProduto.marca = "Sony";
        meuProduto.tamanho = "Medio";
        meuProduto.itensInclusos = "2 Controles e 3 Jogos";

        System.out.println(meuProduto.nome);



    }
}
