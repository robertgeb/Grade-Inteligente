package com.gebhardt;

/**
 * Created by robert on 3/30/17.
 */
public class Turma {
    private String nome;
    private Curso cursos[];
    private int periodoCurso[];
    private Professor professor;
    private int creditos;
    private Sala salas[];
    private Horario horario;

    public Turma(String nome, Curso[] cursos, int[] periodoCurso, Professor professor, int creditos) {
        this.nome = nome;
        this.cursos = cursos;
        this.periodoCurso = periodoCurso;
        this.professor = professor;
        this.creditos = creditos;
    }
}
