/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

/**
 *
 * @author felipedania
 */
public abstract class Local {
    protected static int idLocalLoja;
    private String enderecoLoja, UF;

    public Local(String enderecoLoja, String UF) {
        this.enderecoLoja = enderecoLoja;
        this.UF = UF;
    }

    public static int getIdLocalLoja() {
        return idLocalLoja;
    }

    public static void setIdLocalLoja(int idLocalLoja) {
        Local.idLocalLoja = idLocalLoja;
    }

    public String getEnderecoLoja() {
        return enderecoLoja;
    }

    public void setEnderecoLoja(String enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }
    
}
