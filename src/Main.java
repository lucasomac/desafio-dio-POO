import br.com.lucolimac.bootcamp.Bootcamp;
import br.com.lucolimac.bootcamp.Course;
import br.com.lucolimac.bootcamp.Developer;
import br.com.lucolimac.bootcamp.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("curso java");
        course1.setDescription("descrição curso java");
        course1.setWorkload(8);

        Course course2 = new Course();
        course2.setTitle("curso js");
        course2.setDescription("descrição curso js");
        course2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("mentoria de java");
        mentoring.setDescription("descrição mentoria java");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Developer developerCamila = new Developer();
        developerCamila.setName("Camila");
        developerCamila.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + developerCamila.getSubscribedContents());
        developerCamila.toProgress();
        developerCamila.toProgress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + developerCamila.getSubscribedContents());
        System.out.println("Conteúdos Concluídos Camila:" + developerCamila.getCompletedContents());
        System.out.println("XP:" + developerCamila.calculateTotalXp());

        System.out.println("-------");

        Developer developerJoao = new Developer();
        developerJoao.setName("Joao");
        developerJoao.subscribeBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + developerJoao.getSubscribedContents());
        developerJoao.toProgress();
        developerJoao.toProgress();
        developerJoao.toProgress();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + developerJoao.getSubscribedContents());
        System.out.println("Conteúdos Concluidos João:" + developerJoao.getCompletedContents());
        System.out.println("XP:" + developerJoao.calculateTotalXp());

    }

}
