package org.me.desafio.dominio;

public abstract class Conteudo {

    // Atributos referente a classe Conteudo
    protected static final double XP_PADRAO = 10;
    private String titulo, descricao;

    // Método abstrato para calcular XP
    public abstract double calcularXP();

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
}
