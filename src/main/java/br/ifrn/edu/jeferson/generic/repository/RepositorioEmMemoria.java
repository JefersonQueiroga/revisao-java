package br.ifrn.edu.jeferson.generic.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import br.ifrn.edu.jeferson.generic.entidade.Entidade;

/**
 * Implementação que funciona com qualquer tipo que seja uma Entidade.
 */
public class RepositorioEmMemoria<T extends Entidade> implements Repositorio<T> {

    private Map<Long, T> dados = new ConcurrentHashMap<>();
    private final AtomicLong sequence = new AtomicLong(1);

    @Override
    public void salvar(T entidade) {
        if (entidade.getId() == null) {
            entidade.setId(sequence.getAndIncrement());
        }
        dados.put(entidade.getId(), entidade);
        System.out.println("Salvo: " + entidade.toString());
    }

    @Override
    public T buscarPorId(Long id) {
        return dados.get(id);
    }

    @Override
    public List<T> listarTodos() {
        return new ArrayList<>(dados.values());
    }

    @Override
    public void excluir(Long id) {
        T removido = dados.remove(id);
        if (removido != null) {
            System.out.println("Excluído: " + removido.toString());
        }
    }
}