package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
    private double taxaDeImportacao;
    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);

    }

    //Polimorfismo
    public void setValor (double novoValor) {

        if (novoValor > -100) { // condicional //
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");

        }

    }


    public double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }

    public String getDadosFavoritos() {
        // PS4, Sony e 30
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
        
    }
}
