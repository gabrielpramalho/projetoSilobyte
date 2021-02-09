
package com.mycompany.projetosilobytes.util;

import com.mycompany.projetosilobytes.models.Usuario;
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
    

    @org.junit.jupiter.api.Test
    public void testInserir() {
        Usuario u = new Usuario("victoria_mts", "Victoria Martins", "euamomeunamorado");
        Arquivo.inserir(u);
    }
    
}
