/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SauloJCF
 */
public class DAOUsuario {
    public Usuario getSenha(String cpf){
        String sql = "select senha from usuario where cpf = "+cpf+";";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
             Usuario obj = new Usuario();
             if (rs.next()) {
                obj.setSenha(rs.getString("senha"));
            } else {
                 throw new Exception("Usuário não encontrado");
            } 
             return obj;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
        
    }
   
    public Usuario getNivelDePermissao(String cpf){
        String sql = "select nivelDePermissao from usuario where cpf = "+cpf+";";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
             Usuario obj = new Usuario();
             if (rs.next()) {
                obj.setNivelDePermissao(rs.getInt("nivelDePermissao"));
            } else {
                 throw new Exception("Usuário não encontrado");
            } 
             return obj;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
        
    }
   
    public List<Usuario> preencherTabela(){
        String sql = "select cpf, nome, descricao from usuario;";
        List<Usuario> lista =  new ArrayList<>();
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Usuario obj = new Usuario();
                obj.setCpf(rs.getInt("cpf"));
                obj.setNome(rs.getString("nome"));
                obj.setDescricao(rs.getString("descricao"));
                lista.add(obj);
            }
            return lista;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return null;
    }
    public boolean remover(Usuario obj) {
        String sql = "delete from usuario where cpf = ?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCpf());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Usuário removido com sucesso.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível remover o usuário.");
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
            return false;
        }
    }
}
