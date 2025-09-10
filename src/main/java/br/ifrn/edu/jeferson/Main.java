package br.ifrn.edu.jeferson;

import br.ifrn.edu.jeferson.models.Professor;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Jeferson Queiroga");
        System.out.println(professor.getNome());
    }
}