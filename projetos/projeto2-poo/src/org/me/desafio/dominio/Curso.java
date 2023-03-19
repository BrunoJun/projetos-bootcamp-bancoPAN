package org.me.desafio.dominio;

public class Curso {

    // Atributos referente a classe Curso
    private String titulo, descricao;
    private int cargaHoraria;

    // Construtor padrão
    public Curso() {}

    // Getters e Setters
    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getDescricao() {

        return descricao;
    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;
    }

    public int getCargaHoraria() {

        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {

        this.cargaHoraria = cargaHoraria;
    }

    // Método sobrescrito para impressão dos valores dos atributos, caso um objeto da classe seja impresso
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
