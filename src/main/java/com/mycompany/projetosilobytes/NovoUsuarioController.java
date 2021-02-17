
package com.mycompany.projetosilobytes;

import javafx.fxml.FXML;
import com.mycompany.projetosilobytes.models.Usuario;
import com.mycompany.projetosilobytes.util.Arquivo;
import java.io.IOException;
import javafx.scene.control.TextField;

/**
 *
 * @author Gabriel
 */
public class NovoUsuarioController {
    
    @FXML
    private TextField campoLogin;

    @FXML
    private TextField campoName;

    @FXML
    private TextField campoPassword;
    
    @FXML
    private void cadastrarUsuario() throws IOException{
        Usuario usuario = new Usuario();
        usuario.setLogin(campoLogin.getText());
        usuario.setName(campoName.getText());
        usuario.setPassword(campoPassword.getText());
        Arquivo.inserir(usuario);
        limparCampos();
        App.setRoot("menuPrincipal");
    }
    
    @FXML
    private void limparCampos(){
        this.campoLogin.setText("");
        this.campoName.setText("");
        this.campoPassword.setText("");
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
