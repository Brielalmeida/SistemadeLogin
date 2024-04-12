/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model;

import java.util.ArrayList;

public class Persistencia {
    
    public static ArrayList<Usuario> lista = new ArrayList<Usuario>();
    
    public boolean cadastrar(Usuario user) {
        if(user != null) {
            lista.add(user);
            return true;
        } else {
            return false;
        }
        
    }
    
    /*Excluir alterar e listar*/
    
}
