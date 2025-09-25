package br.ifrn.edu.jeferson.generic.entidade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Produto implements Entidade {
    private Long id;
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public Long getId() { return id; }

    @Override
    public void setId(Long id) { this.id = id; }

    @Override
    public String toString() {
        return "Produto [ID=" + id + ", Nome='" + nome + "', Preço=R$" + preco + "]";
    }
}