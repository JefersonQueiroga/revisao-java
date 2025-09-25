package br.ifm.edu.jeferson.oop;

interface Processavel {
    boolean processar();
    void cancelar();
    String getStatus();
}