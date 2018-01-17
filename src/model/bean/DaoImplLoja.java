/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author felipedania
 */
public class DaoImplLoja {
    
    public boolean validarLoginLoja(String usuario, String senha){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        try{
            stmt = con.prepareStatement("SELECT loginUsuarios, senhaUsuarios FROM Usuarios WHERE loginUsuarios = ? and senhaUsuarios = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if(rs.next()){
                check=true;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao validar o login, informações inseridas estão erradas: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
    }
    
}