/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetosilobytes;

import com.mycompany.projetosilobytes.models.Aluguel;
import com.mycompany.projetosilobytes.models.Produtor;
import com.mycompany.projetosilobytes.util.ArquivoAluguel;
import com.mycompany.projetosilobytes.util.ArquivoProdutor;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Gabriel
 */
public class NovoAluguelController {
    
    @FXML
    private TextField inputName;

    @FXML
    private DatePicker  inputDate;

    @FXML
    private TextField inputQtd;
    
    @FXML
    private Label txt;
    
    
    
    //cadsastrar no arquivo
    //mas antes configurar arquivo
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menuPrincipal");
    }
    
    
    @FXML
    private int verificaID(){
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        int id = 0;
        
        if(lista.isEmpty()){
            return 1;
        }else{
            for(Aluguel u : lista){
                id = u.getId();
            }
            
            return id+1;
        }
        
        
    }
    
    @FXML
    private void cadastrarAluguel() throws IOException{
        ArrayList<Produtor> lista = ArquivoProdutor.listar();
        
        Aluguel a = new Aluguel();
        int prod = -1;
        
        for(Produtor p : lista){
            if(p.getName().equals(inputName.getText())){
                prod = lista.indexOf(p);
            }
            
        if(prod != -1){
            a.setId(verificaID());
            a.setProdutor(lista.get(prod));
            a.setDataInicial(inputDate.getValue());
            a.setStatus("Em aberto");
            double qtd = Double.parseDouble(inputQtd.getText());
            a.setQtd(qtd);
            ArquivoAluguel.inserir(a);
            txt.setText("Deu certo");
            App.setRoot("menuPrincipal");
        }else{
            txt.setText("Deu erro");
        }
        
        
            
        }
        
        
    }
    
}
