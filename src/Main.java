
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(6);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do Curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp de 45 dias");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("====================");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila Java");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConculidos());
        System.out.println("Conteudos Incritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularXp());

        System.out.println("====================");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao Java");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Incritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConculidos());
        System.out.println("Conteudos Incritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularXp());

        System.out.println("====================");


    }
}
