/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

import java.util.ArrayList;

/**
 *
 * @author felipedania
 */
public class Cardapio extends Produtos {

    private ArrayList<Produtos> produtos = new ArrayList<>(), tamanhos = new ArrayList<>();
    private ArrayList<Adicionais> produto = new ArrayList<>();
    /*
    List produtos, agrupa todos os extends
    List tamanhos, agrupa os diferentes tamanhos de copos para o açaí. 300 ml, 500 ml e 700ml 
    */

    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produtos> produtos) {
        this.produtos = produtos;
    }

    public ArrayList<Produtos> getTamanhos() {
        return tamanhos;
    }

    public void setTamanhos(ArrayList<Produtos> tamanhos) {
        this.tamanhos = tamanhos;
    }

    public ArrayList<Adicionais> getProduto() {
        return produto;
    }

    public void setProduto(ArrayList<Adicionais> produto) {
        this.produto = produto;
    }

    public int getIdAdicionais() {
        return idAdicionais;
    }

    public int setIdAdicionais(int idAdicionais) {
        return idAdicionais = proxCod;
    }

}
