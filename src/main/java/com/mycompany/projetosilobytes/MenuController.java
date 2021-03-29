
package com.mycompany.projetosilobytes;

import com.mycompany.projetosilobytes.models.Usuario;
import com.mycompany.projetosilobytes.util.Arquivo;
import java.io.IOException;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author Gabriel
 */
public class MenuController {
    
    @FXML
    private TextField inputLogin;

    @FXML
    private PasswordField inputPassword;
    
    @FXML
    private Text erroText;
    
    @FXML
    private void cadastrarUsuario() throws IOException{
        App.setRoot("novoUsuario");
    }
    
    @FXML
    private void goListUsuario() throws IOException{
        App.setRoot("listaUsuario");
    }
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void entrar() throws IOException{
        
       ArrayList<Usuario> lista = Arquivo.listar();
        for(Usuario u : lista){
            if(u.getLogin().equals(inputLogin.getText())){
                if(u.getPassword().equals(inputPassword.getText())){
                    App.setRoot("menuPrincipal");
                }
            }else{
                erroText.setText("Email ou senha inválidos!");
            }
        }
        
    }
}
    

