import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("aprenda orientacao a objeto");
        curso1.setCargahoraria(10); 

       Curso curso2 = new Curso();
       curso2.setTitulo("Bootcamp QA");
       curso2.setDescricao("Java");
       curso2.setCargahoraria(8);

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("Java");
       mentoria.setDescricao("mentoria de java");
       mentoria.setData(LocalDate.now());


       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java Developer");
       bootcamp.setDescricao("Descrição");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devBruna = new Dev();
       devBruna.setNome("Bruna");
       devBruna.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos Inscritos" + devBruna.getConteudosInscritos());
       devBruna.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscritos" + devBruna.getConteudosInscritos());
       System.out.println("Conteudos Concluidos" + devBruna.getConteudosConcluidos());
       devBruna.calculartotalXp();
       System.out.println("XP: " + devBruna.calculartotalXp());

       System.out.println("--------------");
       Dev devJoao = new Dev();
       devJoao.setNome("Joao");
       devJoao.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
       devJoao.progredir();
       System.out.println("-");
       System.out.println("Conteudos Inscritos" + devJoao.getConteudosInscritos());
       System.out.println("Conteudos Concluidos" + devBruna.getConteudosConcluidos());
       devJoao.calculartotalXp();
       System.out.println("XP: " + devJoao.calculartotalXp());
    }
}
