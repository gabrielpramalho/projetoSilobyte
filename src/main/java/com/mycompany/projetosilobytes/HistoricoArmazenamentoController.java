/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetosilobytes;

import com.mycompany.projetosilobytes.models.Aluguel;
import com.mycompany.projetosilobytes.util.ArquivoAluguel;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 *
 * @author Gabriel
 */
public class HistoricoArmazenamentoController {
    @FXML
    private TextArea inputElements;
    
    @FXML
    private void inputPago(){
        clear();
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for(Aluguel a:lista){
            if(a.getStatus().equals("Pago")){
                String dtFormatado = a.getDataInicial().format(formatter);
                inputElements.appendText("ID: "+a.getId()+"  Nome: "+a.getProdutor().getName()+"    ");
                inputElements.appendText("Data"+dtFormatado+"\n\n");
            }
        }
    }
    @FXML
    private void inputAberto(){
        clear();
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for(Aluguel a:lista){
            if(a.getStatus().equals("Em aberto")){
                String dtFormatado = a.getDataInicial().format(formatter);
                inputElements.appendText("ID: "+a.getId()+"  Nome: "+a.getProdutor().getName()+"    ");
                inputElements.appendText("Data: "+dtFormatado+"\n\n");
            }
        }
        
    }
    @FXML
    private void inputCredito(){
        clear();
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        for(Aluguel a:lista){
            if(a.getStatus().equals("Credito")){
                String dtFormatado = a.getDataInicial().format(formatter);
                inputElements.appendText("ID: "+a.getId()+"  Nome: "+a.getProdutor().getName()+"    ");
                inputElements.appendText("Data: "+dtFormatado+"\n\n");
            }
        }
        
    }
    
    @FXML
    private void clear(){
        inputElements.setText("");
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menuPrincipal");
    }
}

