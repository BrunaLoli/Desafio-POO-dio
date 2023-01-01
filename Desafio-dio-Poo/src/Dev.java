import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
     
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public void inscreverBootcamp (Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.out.println("Você nao está matriculado em nenhum conteudo!");
        }
    }

    public double calculartotalXp(){
        return this.conteudosConcluidos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();
    }
    
    public boolean equals (Object o){
        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dev dev =(Dev) o;
        return Objects.equals(nome,dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }
    public int hashCode(){
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    
    }
}
    
