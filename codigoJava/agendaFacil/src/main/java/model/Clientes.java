
package model;

import java.util.Date;
/**
 *
 * @author Gabriel Abreu
 */
public class Clientes {
    
    private int idCliente;
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    private String cnpj;
    private String cep;
    private String notas;
    private Date dataRegistro;
    private Date alteracaoRegistro;

    //metódos construtores
    public Clientes(int idCliente, String nome, String telefone, String email, 
            String cpf, String cnpj, String cep, String notas, Date dataRegistro, 
            Date alteracaoRegistro) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.cep = cep;
        this.notas = notas;
        this.dataRegistro = dataRegistro;
        this.alteracaoRegistro = alteracaoRegistro;

    }
    //metodo construtor iniciando as datas para evitar possiveis erros de NullPointer
    public Clientes(){
        this.dataRegistro = new Date();
        this.alteracaoRegistro = new Date();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public Date getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(Date dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Date getAlteracaoRegistro() {
        return alteracaoRegistro;
    }

    public void setAlteracaoRegistro(Date alteracaoRegistro) {
        this.alteracaoRegistro = alteracaoRegistro;
    }

    @Override
    public String toString() {
        return "Clientes{" + "idCliente=" + idCliente + ", nome=" + nome + ","
                + " telefone=" + telefone + ", email=" + email + ","
                + " cpf=" + cpf + ","
                + " cnpj=" + cnpj + ", cep=" + cep + ", notas=" + notas + ", "
                + "dataRegistro=" + dataRegistro + ", "
                + "alteracaoRegistro=" + alteracaoRegistro + '}';
    }
   
    
    
}

