package br.ifrn.edu.jeferson.generic.repository.teste;


import br.ifrn.edu.jeferson.generic.entidade.Cliente;
import br.ifrn.edu.jeferson.generic.entidade.Produto;
import br.ifrn.edu.jeferson.generic.repository.Repositorio;
import br.ifrn.edu.jeferson.generic.repository.RepositorioEmMemoria;

public class LojaVirtual {

    public static void main(String[] args) {
        System.out.println("### GERENCIANDO PRODUTOS (ENTIDADES) ###");
        Repositorio<Produto> repoProdutos = new RepositorioEmMemoria<>();

        repoProdutos.salvar(new Produto("Notebook Gamer", 7500.00));
        repoProdutos.salvar(new Produto("Mouse sem fio", 150.00));

        System.out.println("\nBuscando produto com ID 1...");
        Produto produtoEncontrado = repoProdutos.buscarPorId(1L);
        System.out.println("Encontrado: " + produtoEncontrado);

        System.out.println("\n========================================\n");

        System.out.println("### GERENCIANDO CLIENTES (ENTIDADES) ###");
        Repositorio<Cliente> repoClientes = new RepositorioEmMemoria<>();

        repoClientes.salvar(new Cliente("João da Silva", "joao@email.com"));
        repoClientes.salvar(new Cliente("Maria Oliveira", "maria@email.com"));

        System.out.println("\nListando todos os clientes:");
        repoProdutos.listarTodos().forEach(System.out::println);
    }
}