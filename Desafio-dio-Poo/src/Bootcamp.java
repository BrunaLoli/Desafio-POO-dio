import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private String descricao;
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private final LocalDate dataInicial = LocalDate.now();
    public LocalDate getDataInicial() {
        return dataInicial;
    }
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    public LocalDate getDataFinal() {
        return dataFinal;
    }
    private Set<Dev> devInscritos = new HashSet<>();
    public Set<Dev> getDevInscritos() {
        return devInscritos;
    }
    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devInscritos, bootcamp.devInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devInscritos, conteudos);
    }
}
