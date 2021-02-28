
package com.mycompany.projetosilobytes;

import com.mycompany.projetosilobytes.models.Usuario;
import com.mycompany.projetosilobytes.util.Arquivo;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 *
 * @author Gabriel
 */
public class ListaUsuarioController {
    
    @FXML
    private TextArea inputList;
    
    @FXML
    private void listarUsuario(){
        ArrayList<Usuario> lista = Arquivo.listar();
    
        for(Usuario u : lista){
            inputList.appendText("Login: "+u.getLogin()+"    ");
            inputList.appendText("Nome: "+u.getName()+"\n\n");
        }
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menu");
    }
    
    

    
}
