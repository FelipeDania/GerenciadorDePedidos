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
public class Assados {
    private ArrayList<Assados> assados = new ArrayList<>();
    private String nome;
    private double valor;
    private int quantidade;
    protected int idAssados;
    protected static int proxId = 1;

    public Assados(ArrayList<Assados> assados, String nome, double valor, int quantidade) {
        this.assados = assados;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.idAssados = proxId;
        proxId++;
    }

    public Assados(){
        
    }

    public int getIdAssados() {
        return idAssados;
    }

    public void setIdAssados(int idAssados) {
        this.idAssados = idAssados;
    }

    public ArrayList<Assados> getAssados() {
        return assados;
    }

    public void setAssados(ArrayList<Assados> assados) {
        this.assados = assados;
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
}
