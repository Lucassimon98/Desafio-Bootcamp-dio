import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
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


        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Java Powered");
        mentoria1.setDescricao("Descrição");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);
    }
}
