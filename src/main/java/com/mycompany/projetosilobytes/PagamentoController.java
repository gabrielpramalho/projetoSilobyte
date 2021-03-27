
package com.mycompany.projetosilobytes;

import com.mycompany.projetosilobytes.models.Aluguel;
import com.mycompany.projetosilobytes.util.ArquivoAluguel;
import java.io.IOException;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Gabriel
 */
public class PagamentoController {
    @FXML
    private TextField inputID;

    @FXML
    private DatePicker dateExit;

    @FXML
    private Label outDays;

    @FXML
    private Label outPrice;
    
    @FXML
    private Label txt;
    
    @FXML
    private RadioButton credito;

    @FXML
    private RadioButton pago;
    
    @FXML
    private ToggleGroup grupo;
    
    @FXML
    private void calcular() throws IOException{
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        
        RadioButton radio = (RadioButton) grupo.getSelectedToggle();
        
        int id = Integer.parseInt(inputID.getText());
        
        int index = -1;
        
        for(Aluguel a : lista){
            
            if(id == a.getId()){
                index = lista.indexOf(a);
            }
            
        }
        Aluguel a = lista.get(index);
        long dias = DAYS.between(a.getDataInicial(), dateExit.getValue());
        
        double price = dias * 20 * a.getQtd();
        
        String days = Long.toString(dias);
        String priceTotal = Double.toString(price);
        outDays.setText(days);
        outPrice.setText(priceTotal);
        
        
        if (radio.getText().equals("Confirmar Pagamento")){
            ArquivoAluguel.alterar(a, a.getId(), "Pago", price);
            App.setRoot("menuPrincipal");
        }else{
            ArquivoAluguel.alterar(a, a.getId(), "Credito", price);
            App.setRoot("menuPrincipal");
        }
 
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
