package org.senai.prjquiz.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placar {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String pessoa;
    private Integer acertos;
    private Integer erros;


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPessoa() {
        return pessoa;
    }
    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }
    public Integer getAcertos() {
        return acertos;
    }
    public void setAcertos(Integer acertos) {
        this.acertos = acertos;
    }
    public Integer getErros() {
        return erros;
    }
    public void setErros(Integer erros) {
        this.erros = erros;
    }   
}
