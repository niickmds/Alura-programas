package screenmatch.calculos;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

public class CalculadoraDeTempo {

    private int tempoTotalFilme = 0;
    private int tempoTotalSerie = 0;

    public void incluiTempoFilme(ArrayList<Filme> filmes) {
        for (Filme filme : filmes) {
            this.tempoTotalFilme += filme.getDuracao();
        }
        System.out.println("Tempo total para assistir todos os filmes: "+tempoTotalFilme+" minutos");
    }

    public void incluiTempoSerie(ArrayList<Serie> series){
        for (Serie serie : series) {
            this.tempoTotalSerie += serie.getDuracao();
        }
        System.out.println("Tempo total para assistir todas as séries: "+tempoTotalSerie+" minutos");
    }

    public void tempoDeTudo() {
        int tempoTotal = tempoTotalFilme + tempoTotalSerie;
        System.out.println("Tempo total para assistir tudo: " + tempoTotal + " minutos");
    }
}
