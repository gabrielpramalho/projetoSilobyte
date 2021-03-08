/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetosilobytes;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author Gabriel
 */
public class MenuPrincipalController {
    
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void novoAluguel() throws IOException{
        App.setRoot("novoAluguel");
    }
    
    @FXML
    private void novoProdutor() throws IOException{
        App.setRoot("novoProdutor");
    }
    
    @FXML
    private void pagamento() throws IOException{
        App.setRoot("pagamento");
    }
}
