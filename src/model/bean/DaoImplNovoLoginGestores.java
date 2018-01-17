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
public class DaoImplNovoLoginGestores {

    public void validarNovoLoginGestores(String usuario, String senha) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement("INSERT INTO Gestores(loginGestores, senhaGestores) VALUES (?, ?)");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário e senha cadastrados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o usuário e senha! " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
}
