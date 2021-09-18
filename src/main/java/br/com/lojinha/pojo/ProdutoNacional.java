package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoNacional extends Produto implements Favorito {
    private double impostoNacioanl;
    public ProdutoNacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getImpostoNacioanl() {
        return impostoNacioanl;
    }

    public void setImpostoNacioanl(double impostoNacioanl) {
        this.impostoNacioanl = impostoNacioanl;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
