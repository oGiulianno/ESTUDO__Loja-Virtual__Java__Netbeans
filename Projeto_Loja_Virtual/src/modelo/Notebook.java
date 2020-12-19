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
public class Notebook extends Produto{
    
    //atributos
    private String marca;
    private String modelo;
    private int memoria_ram;
    private int capacidade_do_hd;
    private String processador;
    private int tamanho_da_tela;
    private String sistema_operacional;
    
    //metodos
    public Notebook(){}
    public Notebook(int codigo, String descrição, double preço_de_venda, String marca, String modelo, int memoria_ram, int capacidade_do_hd, String processador, int tamanho_da_tela, String sistema_operacional)
     throws Exception{
        if(codigo < 0) throw new Exception("O código não pode ser negativo");
        if(preço_de_venda < 0) throw new Exception("O preço de venda não pode ser negativo");
        if(memoria_ram < 0) throw new Exception("A memória ram não pode ser negativo");
        if(capacidade_do_hd < 0) throw new Exception("A capacidade do HD não pode ser negativo");
        if(tamanho_da_tela < 0) throw new Exception("O tamanho da tela não pode ser negativo");
        this.marca = marca;
        this.modelo = modelo;
        this.memoria_ram = memoria_ram;
        this.capacidade_do_hd = capacidade_do_hd;
        this.processador = processador;
        this.tamanho_da_tela = tamanho_da_tela;
        this.sistema_operacional = sistema_operacional;
    }
    
    //gets e sets

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the memoria_ram
     */
    public int getMemoria_ram() {
        return memoria_ram;
    }

    /**
     * @param memoria_ram the memoria_ram to set
     */
    public void setMemoria_ram(int memoria_ram)throws Exception{
        if(memoria_ram < 0) throw new Exception("A memória ram não pode ser negativo");
        this.memoria_ram = memoria_ram;
    }

    /**
     * @return the capacidade_do_hd
     */
    public int getCapacidade_do_hd()throws Exception{
        if(capacidade_do_hd < 0) throw new Exception("A capacidade do HD não pode ser negativo");
        return capacidade_do_hd;
    }

    /**
     * @param capacidade_do_hd the capacidade_do_hd to set
     */
    public void setCapacidade_do_hd(int capacidade_do_hd) {
        this.capacidade_do_hd = capacidade_do_hd;
    }

    /**
     * @return the processador
     */
    public String getProcessador() {
        return processador;
    }

    /**
     * @param processador the processador to set
     */
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    /**
     * @return the tamanho_da_tela
     */
    public int getTamanho_da_tela()throws Exception{
        if(tamanho_da_tela < 0) throw new Exception("O tamanho da tela não pode ser negativo");
        return tamanho_da_tela;
    }

    /**
     * @param tamanho_da_tela the tamanho_da_tela to set
     */
    public void setTamanho_da_tela(int tamanho_da_tela) {
        this.tamanho_da_tela = tamanho_da_tela;
    }

    /**
     * @return the sistema_operacional
     */
    public String getSistema_operacional() {
        return sistema_operacional;
    }

    /**
     * @param sistema_operacional the sistema_operacional to set
     */
    public void setSistema_operacional(String sistema_operacional) {
        this.sistema_operacional = sistema_operacional;
    }
    
    //to string
    public String toString(){
        return  "Memória Ram: " + memoria_ram+
                "Capacidade do HD: " + capacidade_do_hd+
                "Tamanho da Tela: " + tamanho_da_tela;
    }
    
    
    @Override
    public String getTipoDoProduto() {
        return "Notebook";
    }
    
    
}
