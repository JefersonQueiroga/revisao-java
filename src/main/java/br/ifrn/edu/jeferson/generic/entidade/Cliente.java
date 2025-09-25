package br.ifrn.edu.jeferson.generic.entidade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente implements Entidade {
    private Long id;
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public Long getId() { return id; }

    @Override
    public void setId(Long id) { this.id = id; }


    @Override
    public String toString() {
        return "Cliente [ID=" + id + ", Nome='" + nome + "', Email='" + email + "']";
    }
}