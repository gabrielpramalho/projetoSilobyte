/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetosilobytes.util;

import com.mycompany.projetosilobytes.models.Aluguel;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ArquivoAluguel {
    public static void inserir(Aluguel aluguel) {
        try {
            ArrayList<Aluguel> atual = listar();
            atual.add(aluguel);
            FileOutputStream fos = new FileOutputStream(Info.ARQUIVO_ALUGUEL);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(atual);
            oos.close();
        } catch (IOException ex) {
            System.out.println("Erro ao inserir aluguel");
        }
    }
    
    public static ArrayList<Aluguel> listar() {
        ArrayList<Aluguel> lista = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(Info.ARQUIVO_ALUGUEL);
            ObjectInputStream ois = new ObjectInputStream(fis);
            lista = (ArrayList<Aluguel>) ois.readObject();
            ois.close();
            return lista;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        } catch (EOFException e) {  // arquivo vazio
            return lista;
        } catch (IOException | ClassNotFoundException e) {

        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                System.out.println("Erro ao ler arquivo");
            }
        }
        return lista;
    }
}
