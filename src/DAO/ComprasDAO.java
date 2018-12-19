/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Compras;
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
public class ComprasDAO extends ExecuteSQL{
    
    public ComprasDAO(Connection con) {
        super(con);
    }
    
    
    public String Inserir_Compras(Compras a){
        String sql = "Insert into compras values(0,?,?,?,?)";
        
        try {
            PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
            
            ps.setString(2, a.getCliente());
            ps.setString(1, a.getProduto());
            ps.setInt(3, a.getQuantidade());
            ps.setDouble(4, a.getPreco());
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
    }
    }
    
    
    
    
        public List<Compras> ListarCompras() {
            String sql = "select idcompra, nomepro, nomecli, quantidade, preco from compras";
            List<Compras> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Compras a = new Compras();
                        a.setCodigo(rs.getInt(1));
                        a.setCliente(rs.getString(2));
                        a.setProduto(rs.getString(3));
                        a.setQuantidade(rs.getInt(4));
                        a.setPreco(rs.getDouble(5));
                        
                        
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
        
        public List<Compras> Pesquisar_Cod_Compras(int cod) {
            String sql = "select idcompra, nomepro, nomecli, quantidade, preco from compras where idcompra = '"+cod+"'";
            List<Compras> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Compras a = new Compras();
                        a.setCodigo(rs.getInt(1));
                        a.setCliente(rs.getString(2));
                        a.setProduto(rs.getString(3));
                        a.setQuantidade(rs.getInt(4));
                        a.setPreco(rs.getDouble(5));
                        
                        
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
        
        
        public List<Compras> Pesquisar_Nome_Compras(String nome) {
            String sql = "select idcompra, nomepro, nomecli, quantidade, preco from compras where nomecli like '%"+ nome +"%'";
            List<Compras> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Compras a = new Compras();
                        a.setCodigo(rs.getInt(1));
                        a.setCliente(rs.getString(2));
                        a.setProduto(rs.getString(3));
                        a.setQuantidade(rs.getInt(4));
                        a.setPreco(rs.getDouble(5));
                        
                        
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
        
                
        public List<Compras> ListarComboCompras() {
            String sql = "select idcompra from compras order by idcompra";
            List<Compras> lista = new ArrayList<>();
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {
                    Compras a = new Compras();
                    a.setCliente(rs.getString(1));
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
        public List<Compras> ConsultaCodigoCompras(String nome){
            String sql = "select idcompra from compras where idcompra = '" + nome + "'";
            List<Compras> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Compras a = new Compras();
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
        
        public boolean Testar_Compras(int cod) {
            boolean Resultado = false;
            try {
                String sql = "select * from compras where idcompra = " + cod + "";
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
        
        public List<Compras> CapturarCompras(int cod) {
            String sql = "select idcompra, nomepro, nomecli, quantidade, preco from compras where idcompra =" + cod;
            List<Compras> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                if (rs != null) {
                    while (rs.next()) {
                        Compras a = new Compras();
                        a.setCodigo(rs.getInt(1));
                        a.setCliente(rs.getString(2));
                        a.setProduto(rs.getString(3));
                        a.setQuantidade(rs.getInt(4));
                        a.setPreco(rs.getDouble(5));
                       
                      
                        
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

