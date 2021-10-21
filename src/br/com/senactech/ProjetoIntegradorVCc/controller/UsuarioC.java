/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.controller;

import java.util.ArrayList;
import br.com.senactech.ProjetoIntegradorVCc.model.Usuario;

/**
 *
 * @author User
 */
public class UsuarioC {
    /**
     * Repositório de usuários.
     */
    ArrayList<Usuario> usuarios = new ArrayList<>();
    int idUsuario = 1;
    
    /**
     * Retorna todos os usuários cadastrados no sistema.
     * @return 
     */
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
    
    public int addIdUsuario() {
        return this.idUsuario++;
    }
    
    public void addUsuario(Usuario u) {
        this.usuarios.add(u);
    }
    
    public void removeUsuario(Usuario u) {
        this.usuarios.remove(u);
    }
    
    /**
     * Método mok serve para poder fazer testes com cadastros pré-existentes.
     */
    
    
}
