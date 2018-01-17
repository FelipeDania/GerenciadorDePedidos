/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import avaliacao.Adicionais;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author felipedania
 */
public class DaoImplAdicional {
    
    public void insertAdicionais(Adicionais ad) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Adicional(valorAdicional, nomeAdicional, quantidadeAdicional) VALUES(?, ?, ?)");
            stmt.setDouble(1, ad.getValorAdicionais());
            stmt.setString(2, ad.getNomeAdicionais());
            stmt.setInt(3, ad.getQuantidadeAdicionais());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Adicionais> readAdicionais(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Adicionais> adicionais = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Adicional");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Adicionais ad = new Adicionais();
                ad.setQuantidadeAdicionais(rs.getInt("quantidadeAdicional"));
                ad.setNomeAdicionais(rs.getString("nomeAdicional"));
                ad.setValorAdicionais(rs.getDouble("valorAdicional"));
                ad.setIdAdicionais(rs.getInt("idAdicional"));
                adicionais.add(ad);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao ler os dados: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return adicionais;
    }
    
    public void updateAdicionais(Adicionais ad) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE Adicional SET valorAdicional = ?, nomeAdicional = ?, quantidadeAdicional = ? WHERE idAdicional = ?");
            stmt.setDouble(1, ad.getValorAdicionais());
            stmt.setString(2, ad.getNomeAdicionais());
            stmt.setInt(3, ad.getQuantidadeAdicionais());
            stmt.setInt(4, ad.getIdAdicionais());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void deleteAdicionais(Adicionais ad) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM Adicional WHERE idAdicional = ?");
            stmt.setInt(1, ad.getIdAdicionais());

            stmt.execute();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Adicionais> buscaForLikeAdicional(String descricao) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Adicionais> adicionais = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Adicional WHERE nomeAdicional LIKE ?");
            stmt.setString(1, "%" + descricao + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Adicionais ad = new Adicionais();
                ad.setQuantidadeAdicionais(rs.getInt("quantidadeAdicional"));
                ad.setNomeAdicionais(rs.getString("nomeAdicional"));
                ad.setValorAdicionais(rs.getDouble("valorAdicional"));
                ad.setIdAdicionais(rs.getInt("idAdicional"));
                adicionais.add(ad);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return adicionais;
    }
    
    public void efetuarPedidoAdicionais(Adicionais ad) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE Adicional SET quantidadeAdicional = ? WHERE idAdicional = ?");
            stmt.setInt(3, ad.getQuantidadeAdicionais());
            stmt.setInt(4, ad.getIdAdicionais());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
