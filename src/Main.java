import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição de mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLazaro = new Dev();
        devLazaro.setNome("Lázaro");
        devLazaro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lazaro: " + devLazaro.getConteudosInscritos());

        devLazaro.progredir();
        devLazaro.progredir();
        System.out.println("-".repeat(3));

        System.out.println("Conteúdos Concluidos Lazaro: " + devLazaro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Lazaro: " + devLazaro.getConteudosConcluidos());
        System.out.println("XP: " + devLazaro.calcularTotalXp());

        System.out.println("-".repeat(10));

        Dev devHenrique = new Dev();
        devHenrique.setNome("Henrique");
        devHenrique.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Henrique: " + devHenrique.getConteudosInscritos());

        devHenrique.progredir();
        System.out.println("-".repeat(3));

        System.out.println("Conteúdos inscritos Henrique: " + devHenrique.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Henrique: " + devHenrique.getConteudosConcluidos());
        System.out.println("XP: " + devHenrique.calcularTotalXp());
    }

}
