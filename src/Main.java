import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição: curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição: curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição: Mentoria de Java");
        mentoria.setData(LocalDate.now());

//
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricação bootcamp Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Camila"+devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila"+devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila"+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularXP());

        Dev devKaiby = new Dev();
        devKaiby.setNome("Kaiby");
        devKaiby.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos inscritos Kaiby"+devKaiby.getConteudosInscritos());
        devKaiby.progredir();
        System.out.println("Conteudos inscritos Kaiby"+devKaiby.getConteudosInscritos());
        System.out.println("Conteudos concluidos Kaiby"+devKaiby.getConteudosConcluidos());
        System.out.println("XP: "+devKaiby.calcularXP());






    }
}
