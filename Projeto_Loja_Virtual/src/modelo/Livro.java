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
public class Livro extends Produto{
    
    //atributos
    private String autor;
    private String tradutor;
    private String editora;
    private int ano_de_publicacao;
    
    //metodos
    public Livro(){}
    public Livro(int codigo, String descrição, double preço_de_venda, String autor, String tradutor, String editora, int ano_de_publicacao)
     throws Exception{
        if(codigo < 0) throw new Exception("O código não pode ser negativo");
        if(preço_de_venda < 0) throw new Exception("O preço de venda não pode ser negativo");
        if(ano_de_publicacao < 0) throw new Exception("O ano de publicação não pode ser negativo");
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.ano_de_publicacao = ano_de_publicacao;
    }
    
    //sets e gets

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the tradutor
     */
    public String getTradutor() {
        return tradutor;
    }

    /**
     * @param tradutor the tradutor to set
     */
    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the ano_de_publicacao
     */
    public int getAno_de_publicacao() {
        return ano_de_publicacao;
    }

    /**
     * @param ano_de_publicacao the ano_de_publicacao to set
     */
    public void setAno_de_publicacao(int ano_de_publicacao)throws Exception{
        if(ano_de_publicacao < 0) throw new Exception("O ano de publicação não pode ser negativo");
        this.ano_de_publicacao = ano_de_publicacao;
    }
    
    //to string
    public String toString(){
        return  "Ano de Publicação: " + ano_de_publicacao;
    }
    
    
    @Override
    public String getTipoDoProduto() {
        return "Livro";
    }
    
}
