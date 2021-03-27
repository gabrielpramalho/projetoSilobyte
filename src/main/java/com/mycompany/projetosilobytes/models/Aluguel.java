
package com.mycompany.projetosilobytes.models;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Gabriel
 */
public class Aluguel implements Serializable{
    
    int id;
    Produtor produtor;
    LocalDate dataInicial;
    Double qtd;
    String status;
    Double valor;

    public Aluguel(int id, Produtor produtor, LocalDate dataInicial, Double qtd, String status) {
        this.id = id;
        this.produtor = produtor;
        this.dataInicial = dataInicial;
        this.qtd = qtd;
        this.status = status;
        this.valor = 0.0;
    }

    public Aluguel() {
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public Produtor getProdutor() {
        return produtor;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public Double getQtd() {
        return qtd;
    }
    
    public Double getValor(){
        return valor;
    }

    public void setProdutor(Produtor produtor) {
        this.produtor = produtor;
    }

    public void setDataInicial(LocalDate dataInicial) {
        this.dataInicial = dataInicial;
    }

    public void setQtd(Double qtd) {
        this.qtd = qtd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    
    
    
    
    
}
