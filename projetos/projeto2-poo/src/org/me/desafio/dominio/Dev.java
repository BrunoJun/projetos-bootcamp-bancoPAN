package org.me.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {

    // Atributos referente a classe Dev
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    // Método responsável pela inscrição de um dev em um bootcamp e inicializar o Set de conteudosInscritos
    public void inscreverBootcamp(Bootcamp bootcamp){


    }

    // Método responsável por registrar os conteudos que forem realizados no set de conteudosConcluidos
    public void progredir(){


    }

    // Método responsável por retornar o total de xp de acordo com a progressão atual do dev no bootcamp
    public void calcularTotalXP(){


    }

    // Getters e Setters
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {

        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {

        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {

        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {

        this.conteudosConcluidos = conteudosConcluidos;
    }

    // Equals e Hashcode (implementação padrão do Intellij)
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
