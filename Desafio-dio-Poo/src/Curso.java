
public class Curso extends Conteudo {

    private int cargahoraria;

public int getCargahoraria() {
    return cargahoraria;
}

public Curso(){

}

public double calcularXp(){
    return XP_PADRAO * cargahoraria;
}
public void setCargahoraria(int cargahoraria) {
    this.cargahoraria = cargahoraria;
}
    
public String toString(){
return "Curso{" +
"titulo='" + getTitulo() + '\'' +
", decricao='" + getDescricao() + '\'' +
", cargaHoraria=" + cargahoraria +
'}';

}
   
}
