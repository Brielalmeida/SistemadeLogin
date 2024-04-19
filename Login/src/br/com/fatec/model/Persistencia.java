/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model;

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
    
    /*Excluir alterar e listar*/
    
}
