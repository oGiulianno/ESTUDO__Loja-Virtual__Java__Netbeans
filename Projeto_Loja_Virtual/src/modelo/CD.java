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
public class CD extends Produto{
    
    //atributos
    private String nome_do_album;
    private String banda;
    private String cantor;
    private String genero_musical;
    
    //metodos
    public CD(){}
    public CD(int codigo, String descrição, double preço_de_venda, String nome_do_album, String banda, String cantor, String genero_musical)
     throws Exception{
        if(codigo < 0) throw new Exception("O código não pode ser negativo");
        if(preço_de_venda < 0) throw new Exception("O preço de venda não pode ser negativo");
        this.nome_do_album = nome_do_album;
        this.banda = banda;
        this.cantor = cantor;
        this.genero_musical = genero_musical;
    }
    
    //sets e gets

    /**
     * @return the nome_do_album
     */
    public String getNome_do_album() {
        return nome_do_album;
    }

    /**
     * @param nome_do_album the nome_do_album to set
     */
    public void setNome_do_album(String nome_do_album) {
        this.nome_do_album = nome_do_album;
    }

    /**
     * @return the banda
     */
    public String getBanda() {
        return banda;
    }

    /**
     * @param banda the banda to set
     */
    public void setBanda(String banda) {
        this.banda = banda;
    }

    /**
     * @return the cantor
     */
    public String getCantor() {
        return cantor;
    }

    /**
     * @param cantor the cantor to set
     */
    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    /**
     * @return the genero_musical
     */
    public String getGenero_musical() {
        return genero_musical;
    }

    /**
     * @param genero_musical the genero_musical to set
     */
    public void setGenero_musical(String genero_musical) {
        this.genero_musical = genero_musical;
    }
    
    @Override
    public String getTipoDoProduto() {
        return "CD de Músicas";
    }
    
}
