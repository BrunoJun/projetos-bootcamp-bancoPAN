import org.me.desafio.dominio.Bootcamp;
import org.me.desafio.dominio.Curso;
import org.me.desafio.dominio.Dev;
import org.me.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    // Método para a execução da classe
    public static void main(String[] args) {

        // Criando os objetos das classes
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso POO");
        curso1.setDescricao("Descrição do curso 1");
        curso1.setCargaHoraria(7);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Collections");
        curso2.setDescricao("Descrição do curso 2");
        curso2.setCargaHoraria(3);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Soft Skills");
        mentoria1.setDescricao("Descrição da mentoria 1");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição do BootCamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Ana Clara");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos (Ana): " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos concluidos (Ana): " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXP());

        Dev dev2 = new Dev();
        dev2.inscreverBootcamp(bootcamp);
        dev2.setNome("Bruno Jun");
        System.out.println("Conteúdos inscritos (Bruno): " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos concluidos (Bruno): " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXP());
    }
}
