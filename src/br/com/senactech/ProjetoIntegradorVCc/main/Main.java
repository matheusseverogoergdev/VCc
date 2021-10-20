/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.ProjetoIntegradorVCc.main;

import br.com.senactech.ProjetoIntegradorVCc.controller.UsuarioC;
import java.util.Scanner;
import br.com.senactech.ProjetoIntegradorVCc.model.Usuario;

/**
 *
 * @author João Vitor
 */
public class Main {

    public static Scanner ler = new Scanner(System.in);
    public static UsuarioC cadastroUsuario = new UsuarioC();

    public static String leTexto() {
        Scanner le = new Scanner(System.in);
        return le.nextLine();
    }

    public static void menuPrincipal() {

        System.out.println("\n-- Menu Principal --");
        System.out.println(" 1 - login");
        System.out.println(" 2 - Cadastrar");
        System.out.println(" 0 - Sair");
        System.out.println("Escolha uma opção: ");

    }

    public static void Login() {
        System.out.println("\n-- Menu Login --");
        System.out.println("Email: ");
        leTexto();
        //verificar email
        System.out.println("Senha: ");
        ler.nextInt();
        //Verificar senha
    }

    public static void Cadastro() {
        boolean system = false;

        do {
            System.out.println("\n-- Menu Cadastro --");
            System.out.println("");
            int id;
            boolean status;
            String nome;
            String telefone;
            String email;
            String endereco;
            String cep;

            // variáveis da verificção 2x da senha //            
            String senha1;
            String senha2;

            System.out.println("Nome: ");
            nome = leTexto().toUpperCase();

            // --------------------- //
            //  Verificação Telefone //
            // --------------------- //    
            boolean testeTelefone;
            do {
                System.out.println("Telefone (DDD): ");
                telefone = leTexto();
                if (telefone.length() != 10 && telefone.length() != 11) {
                    testeTelefone = true;
                    System.out.println("Telefone informado esta incorreto!");
                } else {
                    testeTelefone = false;
                    System.out.println("Número correto!");
                }
            } while (testeTelefone);

            // --------------------------------------------- //
            // Fazer verificação de todos os dados abaixo(?) //
            // --------------------------------------------- //
            System.out.println("Email: ");
            email = leTexto();
            System.out.println("Endereço: ");
            endereco = leTexto();
            System.out.println("CEP: ");
            cep = leTexto();

            // ---------------------------- //
            //  Verificação dupla de senha  //
            // ---------------------------- //     
            boolean testeSenha = false; // iniciei p/ ñ acusar erro. A lógica é a mesma do testeTelefone.
            do {
                System.out.println("Senha: ");
                senha1 = leTexto();
                /*
                System.out.println("Informe a senha novamente: ");
                senha2 = leTexto();
                if (senha1 != senha2) {
                    testeSenha = true;
                    System.out.println("Senhas diferentes!");
                } else {
                    testeSenha = false;  
                    System.out.println("Senhas iguais!");                          
                }
                 */
            } while (testeSenha);

            System.out.print("Cliente esta ativa no cadastro? | 1 - Sim! / 2 - Não! |: ");
            byte statusN = ler.nextByte();
            status = statusN == 1;
            id = cadastroUsuario.addIdUsuario();
            Usuario u = new Usuario(id, endereco, nome, telefone, email, cep, status);
            cadastroUsuario.addUsuario(u);

            System.out.println("Deseja continuar cadastrando? S/N: ");
            char continuar = ler.next().charAt(0);
            system = (continuar == 's' || continuar == 'S');

        } while (system);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opM;
        String s = "s";

        do {
            menuPrincipal();
            int m = ler.nextInt();
            switch (m) {
                case 1:
                    Login();
                    break;
                case 2:
                    Cadastro();
                    break;
                case 0:
                    s = "n";
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
            

        } while (s.equalsIgnoreCase("s"));
        System.out.println("Aplicação encerrada pelo usuário!");

    }

}
