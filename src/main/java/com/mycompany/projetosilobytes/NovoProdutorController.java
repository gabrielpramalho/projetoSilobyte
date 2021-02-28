/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetosilobytes;

import com.mycompany.projetosilobytes.models.Produtor;
import com.mycompany.projetosilobytes.util.ArquivoProdutor;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 *
 * @author Gabriel
 */
public class NovoProdutorController {
    
    @FXML
    private TextField inputCPF;

    @FXML
    private DatePicker inputDate;

    @FXML
    private TextField inputName;
    
    @FXML
    private void cadastrar() throws IOException{
        Produtor p = new Produtor();
        p.setName(inputName.getText());
        p.setCpf(inputCPF.getText());
        p.setDataNascimento(inputDate.getValue());
        ArquivoProdutor.inserir(p);
        App.setRoot("menuPrincipal");
    }
}
