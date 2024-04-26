/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Persistencia {
    
    public static ArrayList<Usuario> lista = new ArrayList<Usuario>();

    
    public static ArrayList<Usuario> getLista() {
        return lista;
    }
    
    public boolean cadastrar(Usuario user) {
        if(user != null) {
            lista.add(user);
            return true;
        } else {
            return false;
        }
        
    }
    
    public static ArrayList<Produto> listaProduto = new ArrayList<Produto>();

    
    public static ArrayList<Produto> getListaProd() {
        return listaProduto;
    }
    
    public boolean cadastrar(Produto prod) {
        if(prod != null) {
            listaProduto.add(prod);
            return true;
        } else {
            return false;
        }
        
    }
    
    public static void importar(String arquivo){
        String id, nome, login, senha;
        try{
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            id = lerArq.readLine();
            while(id != null){
                
                nome = lerArq.readLine();
                login = lerArq.readLine();
                senha = lerArq.readLine();
                lista.add(new Usuario(nome, login, senha));
            }
            
            arq.close();
        } catch (IOException e){
            System.err.printf("Erro ao abrir aqrquivo: %s", e.getMessage());
        }
    }
    
    public static void exportar(String nomeArquivo) throws IOException {
        try {
            FileWriter arq = new FileWriter(nomeArquivo);
            PrintWriter gravarArq = new PrintWriter(arq);
            for (Usuario user : lista) {
                gravarArq.print(arq.toString());
            }
            gravarArq.close();
            
        } catch (IOException e){
            System.err.printf("Erro ao gravar aqrquivo: %s", e.getMessage());
        }
    }
    
}
