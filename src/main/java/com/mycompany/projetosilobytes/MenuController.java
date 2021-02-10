
package com.mycompany.projetosilobytes;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author Gabriel
 */
public class MenuController {
    
    @FXML
    private void cadastrarUsuario() throws IOException{
        App.setRoot("novoUsuario");
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
}
