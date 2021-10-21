/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.model;

/**
 *
 * @author User
 */
public class Usuario {
    private String endereco;
    private String nome;
    private String telefone;
    
    public Usuario() {
    
    }

    public Usuario(String endereco, String nome, String telefone) {
        this.endereco = endereco;
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Usuario{" + "endereco=" + endereco + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
    
    
    
}
