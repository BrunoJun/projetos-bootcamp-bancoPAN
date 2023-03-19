package org.me.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    // Atributos referente a classe Mentoria
    private String titulo, descricao;
    private LocalDate data;

    // Construtor padrão
    public Mentoria() {}

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

    public LocalDate getData() {

        return data;
    }

    public void setData(LocalDate data) {

        this.data = data;
    }

    // Método sobrescrito para impressão dos valores dos atributos, caso um objeto da classe seja impresso
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
