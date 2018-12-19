/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Cliente;
import Modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ProdutoDAO extends ExecuteSQL{
    
     public ProdutoDAO(Connection con) {
        super(con);
    }
     
     public String Inserir_Produto(Produto a){
        String sql = "Insert into produto values(0,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setInt(2, a.getQuantidade());
            ps.setDouble(3, a.getPreco());
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
    public List<Produto> ListarProduto() {
            String sql = "select idproduto,nome,quant,preco from produto";
            List<Produto> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Produto a = new Produto();
                        a.setCodigo(rs.getInt(1));
                        a.setNome(rs.getString(2));                     
                        a.setQuantidade(rs.getInt(3));
                        a.setPreco(rs.getDouble(4));
                        
                        lista.add(a);
                    }
                    return lista;
                } else {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
      }
        
        public List<Produto> Pesquisar_Cod_Produto(int cod) {
            String sql = "select idproduto,nome,quant,preco from produto where idproduto = '"+cod+"'";
            List<Produto> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Produto a = new Produto();
                        a.setCodigo(rs.getInt(1));
                        a.setNome(rs.getString(2));                    
                        a.setQuantidade(rs.getInt(3));
                        a.setPreco(rs.getDouble(4));
                       
                        
                        lista.add(a);
                    }
                    return lista;
                } else {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
            }
        
        
        
        public List<Produto> Pesquisar_Nome_Produto(String nome) {
            String sql = "select idproduto,nome,quant,preco from produto where nome like '%"+ nome +"%'";
            List<Produto> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Produto a = new Produto();
                        a.setCodigo(rs.getInt(1));
                        a.setNome(rs.getString(2));
                        a.setQuantidade(rs.getInt(3));
                        a.setPreco(rs.getDouble(4));
                        
                        
                        lista.add(a);
                    }
                    return lista;
                } else {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
        }

            public List<Produto> Pesquisar_Preco_Produto(String nome) {
            String sql = "select preco from produto where nome = '"+ nome +"'";
            List<Produto> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Produto a = new Produto();

                        a.setPreco(rs.getDouble(1));
                        
                        lista.add(a);
                    }
                    return lista;
                } else {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
        }

        
        
        public List<Produto> ConsultaCodigoProduto(String nome){
            String sql = "select idproduto from produto where nome = '" + nome + "'";
            List<Produto> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Produto a = new Produto();
                        a.setCodigo(rs.getInt(1));
                        lista.add(a);
                    }
                    return lista;
                } else {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
        }
         public boolean Testar_Produto(int cod) {
            boolean Resultado = false;
            try {
                String sql = "select * from produto where idproduto = " + cod + "";
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs !=null) {
                   while (rs.next()) {
                       Resultado = true;
                   } 
                }
            } catch (Exception e) {
                e.getMessage();
            }
            return Resultado;
        }
         
        public List<Produto> ConsultaNome(){
            String sql = "select nome from produto";
            List<Produto> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Produto a = new Produto();
                        a.setNome(rs.getString(1));
                        lista.add(a);
                    }
                    return lista;
                } else {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
        }

        public List<Produto> ConsultaCodProduto(String nome){
            String sql = "select idproduto, preco from produto where nome = '" + nome + "'";
            List<Produto> lista = new ArrayList<>();
            
            try {
                com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Produto a = new Produto();
                        a.setCodigo(rs.getInt(1));
                        a.setPreco(rs.getDouble(2));
                        lista.add(a);
                    }
                    return lista;
                } else {
                    return null;
                }
            } catch (Exception e) {
                return null;
            }
        }
        
}
