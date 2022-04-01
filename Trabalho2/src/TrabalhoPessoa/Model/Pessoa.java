/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoPessoa.Model;


/**
 *
 * @author Rafael
 */

public class Pessoa {
    private int idPessoa;
    private String nomePessoa;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private boolean status;
    
    
    
    public Pessoa(){
    }


    public Pessoa(int idPessoa, String nomePessoa, String cpf, String endereco, String telefone, int idade, boolean status) {
        this.idPessoa = idPessoa;
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.status = status;
    }

    /**
    public int getIdPessoa() {
        return idPessoa;
    }

    /**
     * Set o id da Pessoa
     * @param idPessoa 
     */
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nomePessoa=" + nomePessoa + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", idade=" + idade + ", status=" + status + '}';
    }

    public int getIdPessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    
}
