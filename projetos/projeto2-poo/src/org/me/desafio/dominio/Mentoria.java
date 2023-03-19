package org.me.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    // Atributos referente a classe Mentoria
    private LocalDate data;

    // Construtor padrão
    public Mentoria() {}

    // Getters e Setters
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    // Implementando o método abstrato herdado da classe Conteudo
    @Override
    public double calcularXP() {

        return XP_PADRAO + 20;
    }
}
