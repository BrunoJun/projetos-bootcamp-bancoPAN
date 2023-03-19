package org.me.desafio.dominio;

public class Curso extends Conteudo{

    // Atributos referente a classe Curso
    private int cargaHoraria;

    // Construtor padrão
    public Curso() {}

    // Getters e Setters
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
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXP() {

        return XP_PADRAO * this.cargaHoraria;
    }
}
