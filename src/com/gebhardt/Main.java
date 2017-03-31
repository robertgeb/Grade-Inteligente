package com.gebhardt;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor("xl");
        Curso curso = new Curso("Sistemas de Informação");
        Curso cursos[] = {curso};
        int periodos[] = {0};
        Turma turma = new Turma("Tópicos em Algoritmo", cursos, periodos, professor, 2);
        Turma turmas[] = {turma};
        Grade grade = new Grade(turmas);

    }
}
