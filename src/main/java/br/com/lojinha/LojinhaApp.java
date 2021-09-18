package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Sony", Tamanho.MEDIO);

        meuProduto.setNome("PlayStation 5");
        meuProduto.setValor(4999.99);

        List<ItemIncluso> itensInclusos = new ArrayList<ItemIncluso>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("Cabo de energia", 2);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("Jogos", 3);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

        System.out.println("Começando a apresentar os itens");

        for (ItemIncluso itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Nintendo", Tamanho.MEDIO);
        System.out.println(meuProdutoInternacional.getMarca());

        System.out.println("Acabaram os itens");
    }
}
