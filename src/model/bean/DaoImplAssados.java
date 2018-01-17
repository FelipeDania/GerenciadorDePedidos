/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import avaliacao.Assados;
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
public class DaoImplAssados {
    
    public void insertAssados(Assados a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Assados(valorAssado, nomeAssado, quantidadeAssado) VALUES(?, ?, ?)");
            stmt.setDouble(1, a.getValor());
            stmt.setString(2, a.getNome());
            stmt.setInt(3, a.getQuantidade());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Assados> readAssados(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Assados> assados = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM Assados");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Assados a = new Assados();
                a.setQuantidade(rs.getInt("quantidadeAssado"));
                a.setNome(rs.getString("nomeAssado"));
                a.setValor(rs.getDouble("valorAssado"));
                a.setIdAssados(rs.getInt("idAssados"));
                assados.add(a);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao ler os dados: " + ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return assados;
    }
    
    public void updateAssados(Assados a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE Assados SET valorAssado = ?, nomeAssado = ?, quantidadeAssado = ? WHERE idAssados = ?");
            stmt.setDouble(1, a.getValor());
            stmt.setString(2, a.getNome());
            stmt.setInt(3, a.getQuantidade());
            stmt.setInt(4, a.getIdAssados());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void deleteAssados(Assados a) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM Assados WHERE idAssados = ?");
            stmt.setInt(1, a.getIdAssados());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Assados> buscaForLikeAssados(String descricao) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Assados> assados = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Assados WHERE nomeAssado LIKE ?");
            stmt.setString(1, "%" + descricao + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Assados a = new Assados();
                a.setQuantidade(rs.getInt("quantidadeAssado"));
                a.setNome(rs.getString("nomeAssado"));
                a.setValor(rs.getDouble("valorAssado"));
                a.setIdAssados(rs.getInt("idAssados"));
                assados.add(a);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro na busca " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return assados;
    }
    
}
