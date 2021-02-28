
package com.mycompany.projetosilobytes.models;

import java.io.Serializable;
import java.time.LocalDate;


public class Produtor implements Serializable{
    
    String name;
    String cpf;
    LocalDate dataNascimento;

    public Produtor() {
    }

    public Produtor(String name, String cpf, LocalDate dataNascimento) {
        this.name = name;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
    
}
