import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição");
        curso2.setCargaHoraria(12);


        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Java Powered");
        mentoria1.setDescricao("Descrição");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devLucas.getConteudosInscritos());
        
        devLucas.progredir();
        System.out.println("-Falta fazer-");
        System.out.println("Conteúdos Ainda tem a fazer: " + devLucas.getConteudosInscritos());
        System.out.println("-Concluido-");
        System.out.println("Conteúdos concluidos: " + devLucas.getConteudosConcluidos());
        devLucas.progredir();
        
        System.out.println("-XP-" + devLucas.calcularXp());

        
        Dev devNathalia = new Dev();
        devNathalia.setNome("Nathalia");
        devNathalia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devNathalia.getConteudosInscritos());
        
        devNathalia.progredir();
        
        System.out.println("-Concluido-");
        System.out.println("Conteúdos concluidos: " + devNathalia.getConteudosConcluidos());
        System.out.println("-XP-" + devNathalia.calcularXp());

    }
}
