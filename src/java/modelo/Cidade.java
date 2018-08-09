/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 43083
 */
public class Cidade {

    private int cid_codigo;
    private String est_sigla;
    private String nome;

    public Cidade(int cid_codigo, String est_sigla, String nome) {
        this.cid_codigo = cid_codigo;
        this.est_sigla = est_sigla;
        this.nome = nome;
    }

    public int getCid_codigo() {
        return cid_codigo;
    }

    public void setCid_codigo(int cid_codigo) {
        this.cid_codigo = cid_codigo;
    }

    public String getEst_sigla() {
        return est_sigla;
    }

    public void setEst_sigla(String est_sigla) {
        this.est_sigla = est_sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
