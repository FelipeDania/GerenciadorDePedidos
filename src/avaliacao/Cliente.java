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
public class Cliente extends Local{
    protected static int idCliente;

    public Cliente(String enderecoLoja, String UF) {
        super(enderecoLoja, UF);
    }


    public static int getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(int idCliente) {
        Cliente.idCliente = idCliente;
    }

    public static int getIdLocalLoja() {
        return idLocalLoja;
    }

    public static void setIdLocalLoja(int idLocalLoja) {
        Local.idLocalLoja = idLocalLoja;
    }
    
    
}
