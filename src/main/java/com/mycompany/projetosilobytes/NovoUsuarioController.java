
package com.mycompany.projetosilobytes;

import javafx.fxml.FXML;
import com.mycompany.projetosilobytes.models.Usuario;
import com.mycompany.projetosilobytes.util.Arquivo;
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
    private void cadastrarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setLogin(campoLogin.getText());
        usuario.setName(campoName.getText());
        usuario.setPassword(campoPassword.getText());
        Arquivo.inserir(usuario);
        limparCampos();
    }
    
    @FXML
    private void limparCampos(){
        this.campoLogin.setText("");
        this.campoName.setText("");
        this.campoPassword.setText("");
    }
    
    
}
