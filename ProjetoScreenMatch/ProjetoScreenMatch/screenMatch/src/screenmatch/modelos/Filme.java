package screenmatch.modelos;

import screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private final String diretor;

    public Filme(String nome, int anoDeLancamento, int duracao, String diretor, String sinopse){
        super(nome, sinopse, anoDeLancamento, duracao);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void informacoesFilme() {
        System.out.println("Nome do filme: " + getNome());
        System.out.println("Sinopse: " + getSinopse());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração do filme em minutos: " +getDuracao());
        System.out.println("Total de avaliações: " +getTotalAvaliacoes()); //outro jeito de pegar o total de avaliacoes quando o valor é privado
        System.out.println("Média: " + getSomaDasAvaliacoes());
        System.out.println("Diretor: " +getDiretor());
    }

    @Override
    public double getClassificacao() {
        return pegaMedia() / 2;
    }

    @Override
    public String toString(){
        return "Filme: " +this.getNome() + " (" +this.getAnoDeLancamento()+ ")"; //com esse override, ao inves de imprimir o endereco de memoria, é impresso a String do elemento desejado
    }
}