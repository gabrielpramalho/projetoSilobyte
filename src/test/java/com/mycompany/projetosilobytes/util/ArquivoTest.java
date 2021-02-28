
package com.mycompany.projetosilobytes.util;

import com.mycompany.projetosilobytes.models.Produtor;
import com.mycompany.projetosilobytes.models.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gabriel
 */
public class ArquivoTest {
    
    public ArquivoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

//    @org.junit.jupiter.api.Test
//    public void testInserir() {
//        Usuario u = new Usuario("victoria_mts", "Victoria Martins", "euamomeunamorado");
//        Arquivo.inserir(u);
//    }
    
//    @org.junit.jupiter.api.Test
//    public void testListar(){
//        ArrayList<Usuario> lista = Arquivo.listar();
//        for(Usuario u : lista){
//            System.out.println("login: "+u.getLogin());
//            System.out.println("nome: "+u.getName());
//            System.out.println("senha: "+u.getPassword());
//            System.out.println(" ");
//        }
//    }
    
//        @org.junit.jupiter.api.Test
//        public void testInserir() {
//            LocalDate dt = LocalDate.now();
//            Produtor u = new Produtor("gabriel", "999.999.999-99", dt);
//
//            ArquivoProdutor.inserir(u);
//
//        }
    
//        @org.junit.jupiter.api.Test
//        public void testListar(){
//        ArrayList<Produtor> lista = ArquivoProdutor.listar();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        for(Produtor u : lista){
//            String dtFormatado = u.getDataNascimento().format(formatter);
//            System.out.println("name: "+u.getName());
//            System.out.println("cpf: "+u.getCpf());
//            System.out.println("Data Nascimento: "+dtFormatado);
//            System.out.println(" ");
//        }
//    }
    
}
