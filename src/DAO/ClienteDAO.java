/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Cliente;
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
public class ClienteDAO extends ExecuteSQL {
    
     public ClienteDAO(Connection con) {
        super(con);
       
    }
     public List<Cliente> ListarComboCliente() {
            String sql = "select nome from cliente order by nome";
            List<Cliente> lista = new ArrayList<>();
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {
                    Cliente a = new Cliente();
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
     
    public String Inserir_Cliente(Cliente a){
        String sql = "Insert into cliente values(0,?,?,?,?)";
        
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getTelefone());
            ps.setString(3, a.getCpf());
            ps.setString(4, a.getRua());
            
            
            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir.";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
      public List<Cliente> ListarCliente() {
            String sql = "select idcliente,nome,cpf,telefone from cliente";
            List<Cliente> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Cliente a = new Cliente();
                        a.setCodigo(rs.getInt(1));
                        a.setNome(rs.getString(2));                     
                        a.setCpf(rs.getString(3));
                        a.setTelefone(rs.getString(4));
                        
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
        
        public List<Cliente> Pesquisar_Cod_Cliente(int cod) {
            String sql = "select idcliente,nome,cpf,telefone from cliente where idcliente = '"+cod+"'";
            List<Cliente> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Cliente a = new Cliente();
                        a.setCodigo(rs.getInt(1));
                        a.setNome(rs.getString(2));                    
                        a.setCpf(rs.getString(3));
                        a.setTelefone(rs.getString(4));
                       
                        
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
        
        
        
        public List<Cliente> Pesquisar_Nome_Cliente(String nome) {
            String sql = "select idcliente,nome,cpf,telefone from cliente where nome like '%"+ nome +"%'";
            List<Cliente> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Cliente a = new Cliente();
                        a.setCodigo(rs.getInt(1));
                        a.setNome(rs.getString(2));
                        a.setCpf(rs.getString(3));
                        a.setTelefone(rs.getString(4));
                        
                        
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
         public List<Cliente> ConsultaCodigoCliente(String nome){
            String sql = "select idcliente from cliente where nome = '" + nome + "'";
            List<Cliente> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Cliente a = new Cliente();
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
         public boolean Testar_Cliente(int cod) {
            boolean Resultado = false;
            try {
                String sql = "select * from cliente where idcliente = " + cod + "";
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
         
         public List<Cliente> ListarNomeCliente() {
            String sql = "select nome from cliente";
            List<Cliente> lista = new ArrayList<>();
            
            try {
                PreparedStatement ps = (PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        

                        Cliente a = new Cliente();
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
         
      public List<Cliente> ConsultaCodCliente(String nome){
            String sql = "select idcliente from cliente where nome = '" + nome + "'";
            List<Cliente> lista = new ArrayList<>();
            
            try {
                com.mysql.jdbc.PreparedStatement ps = (com.mysql.jdbc.PreparedStatement) getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs != null) {
                    while (rs.next()) {                        
                        Cliente a = new Cliente();
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
         
}
