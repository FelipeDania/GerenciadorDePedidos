/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import avaliacao.Bebidas;
import dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author felipedania
 */
public class DaoImplBebidas {

    /*private PreparedStatement psBebidas = null;
    private Connection connBebidas = ConnectionFactory.abreconexao();*/
    public void insertBebidas(Bebidas b) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO Bebidas(valorBebida, nomeBebida, quantidadeBebida, idBebidas) VALUES(?, ?, ?)");
            stmt.setDouble(1, b.getValor());
            stmt.setString(2, b.getNome());
            stmt.setInt(3, b.getQuantidade());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Bebidas> readBebidas() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Bebidas> bebidas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Bebidas");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Bebidas b = new Bebidas();
                b.setQuantidade(rs.getInt("quantidadeBebida"));
                b.setNome(rs.getString("nomeBebida"));
                b.setValor(rs.getDouble("valorBebida"));
                b.setIdBebidas(rs.getInt("idBebidas"));
                bebidas.add(b);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoImplBebidas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return bebidas;
    }

    public List<Bebidas> buscaForLikeBebida(String descricao) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList<Bebidas> bebidas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM Bebidas WHERE nomeBebida LIKE ?");
            stmt.setString(1, "%" + descricao + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Bebidas b = new Bebidas();
                b.setQuantidade(rs.getInt("quantidadeBebida"));
                b.setNome(rs.getString("nomeBebida"));
                b.setValor(rs.getDouble("valorBebida"));
                b.setIdBebidas(rs.getInt("idBebidas"));
                bebidas.add(b);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoImplBebidas.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return bebidas;
    }

    public void updateBebidas(Bebidas b) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE Bebidas SET valorBebida =?, nomeBebida = ?, quantidadeBebida = ? WHERE id = ?");
            stmt.setDouble(1, b.getValor());
            stmt.setString(2, b.getNome());
            stmt.setInt(3, b.getQuantidade());
            stmt.setInt(4, b.getIdBebidas());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void deleteBebidas(Bebidas b) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM Bebidas WHERE idBebidas = ?");
            stmt.setInt(1, b.getIdBebidas());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
