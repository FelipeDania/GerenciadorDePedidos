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
public class Bebidas {
    private ArrayList<Bebidas> bebidas = new ArrayList<>();
    private String nome;
    private double valor;
    private int quantidade;
    protected int idBebidas;
    protected static int proxCod = 1;
    
    public Bebidas(ArrayList<Bebidas> bebidas, String nome, double valor, int quantidade) {
        this.bebidas = bebidas;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.idBebidas = proxCod;
        proxCod++;
    }

    public Bebidas() {
    }
    
    public ArrayList<Bebidas> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebidas> bebidas) {
        this.bebidas = bebidas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdBebidas() {
        return proxCod;
    }

    public void setIdBebidas(int idBebidas) {
        this.idBebidas = idBebidas;
    }
    
}
