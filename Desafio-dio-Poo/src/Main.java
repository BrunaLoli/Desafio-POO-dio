import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("aprenda orientacao a objeto");
        curso1.setCargahoraria(10);
        System.out.println(curso1); 

       Curso curso2 = new Curso();
       curso2.setTitulo("Bootcamp QA");
       curso2.setDescricao("Neste curso voce irá aprender o que faz um QA e linguagem de programação");
       curso2.setCargahoraria(100);
       System.out.println(curso2); 

       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("Java");
       mentoria.setDescricao("mentoria de java");
       mentoria.setData(LocalDate.now());

       System.out.println(mentoria);
    }
}
