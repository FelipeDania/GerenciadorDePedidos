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
public class Produtos extends Adicionais {

    /*
    * Importar listas de cada classe com todos os atributos, herdando todos
    * os dados para usar no cardápio.
    * 
    * Listas com os produtos importados das classes de
    * origem(adicionais) e não criadas nesta classe
     */
    private ArrayList<Adicionais> adicionais = new ArrayList<>();
    private ArrayList<Bebidas> bebidas = new ArrayList<>();
    private ArrayList<Assados> assados = new ArrayList<>();

    public Produtos() {

    }

    public void adicionarAssados(Assados a) {
        this.assados.add(a);
    }

    public void removerAssados(Assados a) {
        this.assados.remove(a);
    }

    public void adicionarBebidas(Bebidas b) {
        this.bebidas.add(b);
    }

    public void removerBebidas(Bebidas b) {
        this.bebidas.remove(b);
    }

    public void adicionarProdutos(Adicionais p) {
        this.adicionais.add(p);
    }

    public void removerProdutos(Adicionais p) {
        this.adicionais.remove(p);
    }

    public Produtos(ArrayList<Adicionais> adicionais, String nomeAdicionais, double valorAdicionais, int quantidadeAdicionais) {
        super(adicionais, nomeAdicionais, valorAdicionais, quantidadeAdicionais);
    }

    public Produtos(ArrayList<Adicionais> produto) {
        this.adicionais = produto;
    }

    /*public void atualizarSituacao(int situacao) {
        this.situacao = situacao;
    }
    
     public void atualizarDisponibilidade() {
        boolean verifica = bebidas.verificaDisponibilidade(bebidas);
        if (verifica) {
            this.bebidas != null;
            System.out.println("Horario atualizado.");
        } else {
            System.out.println("Horario indisponivel.");
        }
    }*/
}
