package br.ifrn.edu.jeferson.generic.repository;

import br.ifrn.edu.jeferson.generic.entidade.Entidade;

import java.util.List;

/**
 * Interface de repositório com um único tipo genérico 'T'.
 * A declaração <T extends Entidade> garante que qualquer tipo 'T'
 * usado aqui DEVE implementar a interface Entidade.
 */
public interface Repositorio<T extends Entidade> {

    void salvar(T entidade);

    T buscarPorId(Long id);

    List<T> listarTodos();

    void excluir(Long id);
}