
package compras;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.FileSystems;


public class Produto {
    private String produto;
    private String preco;
    private String quantidade;
    private String cliente;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    public void cadastrar(String produto,String preco, String quantidade,String Cliente){
    File produtos = new File("cadastrados");
    produtos.mkdir();
    try{
    
    File arquivo = new File("cadastrados/"+Cliente);
    arquivo.mkdir();
    File Produto = new File ("cadastrados/"+Cliente+"/"+produto);
    Produto.mkdir();
    
    PrintWriter pro = new PrintWriter(arquivo+"/"+produto+"/Produto.txt");
    PrintWriter pre = new PrintWriter(arquivo+"/"+produto+"/Preco.txt");
    PrintWriter qtn = new PrintWriter(arquivo+"/"+produto+"/Quantidade.txt");
    
    
    pro.println(produto);
    pro.close();
    pre.println(preco);
    pre.close();
    qtn.println(quantidade);
    qtn.close();
    
    }catch(Exception e){
        
    }
    
    }
}
 
