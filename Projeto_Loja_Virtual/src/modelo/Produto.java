/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Giu
 */
abstract public class Produto {
    
    //atributos
    private int codigo;
    private String descricao;
    private double preco_de_venda;
    
    //metodos
    public Produto(){}
    public Produto(int codigo, String descrição, double preço_de_venda)
     throws Exception{
        if(codigo < 0) throw new Exception("O código não pode ser negativo");
        if(preço_de_venda < 0) throw new Exception("O preço de venda não pode ser negativo");
        this.codigo = codigo;
        this.descricao = descrição;
        this.preco_de_venda = preço_de_venda;
    }
    
    //gets e sets

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo)throws Exception{
        if(codigo < 0) throw new Exception("O código não pode ser negativo");
        this.codigo = codigo;
    }

    /**
     * @return the descrição
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descrição the descrição to set
     */
    public void setDescricao(String descrição) {
        this.descricao = descrição;
    }

    /**
     * @return the preço_de_venda
     */
    public double getPreco_de_venda() {
        return preco_de_venda;
    }

    /**
     * @param preço_de_venda the preço_de_venda to set
     */
    public void setPreco_de_venda(double preço_de_venda)throws Exception{
        if(preço_de_venda < 0) throw new Exception("O preço de venda não pode ser negativo");
        this.preco_de_venda = preço_de_venda;
    }
    
    //to string
    public String toString(){
        return  "Codigo: " + codigo +
                "Preço de Venda: " + preco_de_venda;
    }
    

    //metodo abstrato
    public abstract String getTipoDoProduto();
    
    
}
