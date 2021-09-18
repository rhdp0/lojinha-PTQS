package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

public class ProdutoInternacional extends Produto implements Favorito {
    private double taxaDeImportação;

    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que -100");
        }
    }

    public double getTaxaDeImportaçãoaxaDeImportação() {
        return taxaDeImportação;
    }

    public void setTaxaDeImportação(double impostoInternacional) {
        this.taxaDeImportação = impostoInternacional;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + ", " + this.getValor();
    }
}
