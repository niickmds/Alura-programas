package screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import screenmatch.excecao.ErrodeConversaoDeAnoExcpetion;

public class Titulo implements Comparable<Titulo> { //titulo se compara com outro <titulo>

    protected String nome;
    protected String sinopse;
    protected boolean incluidoNoPlano;
    protected double somaDasAvaliacoes;
    protected int anoDeLancamento;
    protected int totalAvaliacoes = 0;
    protected int duracao;

    public Titulo(String nome, String sinopse, int anoDeLancamento, int duracao) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.anoDeLancamento = anoDeLancamento;
        this.duracao = duracao;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4){
            throw new ErrodeConversaoDeAnoExcpetion("Não consegui converter o ano porque tem mais de 04 caracteres.");
        }
        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.year());
        this.duracao = Integer.parseInt(meuTituloOmdb.runtime().substring(0,2));
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalAvaliacoes(){ //metodo para que se possa acessar o valor privado de algo
        return totalAvaliacoes;
    }

    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }


    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }


    @Override
    public int compareTo(@NotNull Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome()); //vai comparar o nome de um titulo com o nome do outro titulo
    }

    @Override
    public String toString() {
        return "(nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + "," + " duração=" + duracao + ")";
    }
}
