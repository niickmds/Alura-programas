package screenmatch.modelos;

public class Serie extends Titulo{

    private final int temporadas;
    private int episodios;
    private final int minutosEp;
    private boolean ativo;

    public Serie(String nome, int anoDeLancamento, int temporadas, int episodios, int minutosEp,int duracao, String sinopse){
        super(nome, sinopse, anoDeLancamento,0);
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.minutosEp = minutosEp;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodios() {
        return episodios;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getMinutosEp() {
        return minutosEp;
    }


    public void informacoesSerie() {
        System.out.println("Nome da série: " + getNome());
        System.out.println("Sinopse: " + getSinopse());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Temporadas: "+getTemporadas());
        System.out.println("Episódios: "+getEpisodios());
        System.out.println("Minutos por episódio: "+getMinutosEp());
        System.out.println("Duração total em minutos: "+ getDuracao());
    }

    @Override
    public int getDuracao() {
        return (temporadas * episodios * minutosEp);
    }

    @Override
    public String toString(){
        return "Série: " +this.getNome() + " (" +this.getAnoDeLancamento()+ ")"; //com esse override, ao inves de imprimir o endereco de memoria, é impresso a String do elemento desejado
    }
}
