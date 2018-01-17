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
public class Adicionais {
    private ArrayList<Adicionais> adicionais = new ArrayList<>();
    private String nomeAdicionais;
    private double valorAdicionais;
    private int quantidadeAdicionais;
    protected int idAdicionais;
    protected static int proxCod = 1;
    
    public Adicionais(ArrayList<Adicionais> adicionais, String nome, double valor, int quantidade) {
        this.nomeAdicionais = nome;
        this.valorAdicionais = valor;
        this.quantidadeAdicionais = quantidade;
        this.idAdicionais = proxCod;
        this.proxCod++;
    }
    
    public Adicionais(){
        
    }

    /*
    public ArrayList<Produto> getAdicionais(ArrayList<Produto> adicionais) {
        return adicionais;
    }

    public void setAdicionais(ArrayList<Produto> adicionais) {
        this.adicionais = adicionais;
    }
    
    public void setAdicionais(Adicionais adicionais) {
        adicionais.add(this);
    }
    */
    public String getNomeAdicionais() {
        return nomeAdicionais;
    }

    public void setNomeAdicionais(String nomeAdicionais) {
        this.nomeAdicionais = nomeAdicionais;
    }

    public double getValorAdicionais() {
        return valorAdicionais;
    }

    public void setValorAdicionais(double valorAdicionais) {
        this.valorAdicionais = valorAdicionais;
    }

    public int getQuantidadeAdicionais() {
        return quantidadeAdicionais;
    }

    public void setQuantidadeAdicionais(int quantidadeAdicionais) {
        this.quantidadeAdicionais = quantidadeAdicionais;
    }
    
    public int getIdAdicionais() {
        return idAdicionais;
    }

    public int setIdAdicionais(int idAdicionais) {
        return idAdicionais = proxCod;
    }
}
