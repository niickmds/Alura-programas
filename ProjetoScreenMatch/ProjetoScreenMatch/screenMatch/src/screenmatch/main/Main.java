package screenmatch.main;

import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.Recomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Carros",2006,117,"Brian Fee","Ao viajar para a Califórnia, o famoso carro de corridas Relâmpago McQueen se perde e vai parar em Radiator Springs, uma cidadezinha na Rota 66. Ele conhece novos amigos e aprende lições que mudam sua forma de encarar a vida.");

        meuFilme.avalia(9);
        meuFilme.avalia(2);
        meuFilme.avalia(10);

        meuFilme.informacoesFilme();

        System.out.print("\n");

        Filme outroFilme = new Filme("Duna 2",2024,166,"Denis Villneuve","Paul Atreides se une a Chani e aos Fremen enquanto busca vingança contra os conspiradores que destruíram sua família. Enfrentando uma escolha entre o amor de sua vida e o destino do universo, ele deve evitar um futuro terrível que só ele pode prever.");

        outroFilme.avalia(6);
        outroFilme.avalia(4);
        outroFilme.avalia(8);

        outroFilme.informacoesFilme();

        System.out.print("\n");

        var porraFilme =  new Filme("Garfield",2024,101,"Mark Dindal","Garfield tem um reencontro inesperado com seu pai, que estava há muito tempo desaparecido - um gato de rua todo desengonçado que atrai o filho para um assalto de alto risco.");

        porraFilme.avalia(9);
        porraFilme.avalia(9.5);
        porraFilme.avalia(10);

        porraFilme.informacoesFilme();

        System.out.print("\n");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>(); //estrutura de dados lista
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(porraFilme);
       // System.out.println("Primeiro filme da lista: " +listaDeFilmes.get(0).toString()); //imprime o primeiro filme da lista com toString
       // System.out.println("Tamanho da lista: " +listaDeFilmes.size()); //imprime o tamanho filme da lista com toString
       // System.out.println(listaDeFilmes);

        System.out.print("\n");

        Serie minhaSerie = new Serie("Attack on Titan",2013,4,20,23,0,"Para escapar dos titãs, gigantes devoradores de homens, a humanidade se refugiou em cidades cercadas por enormes muralhas. Quando eles voltam a atacar, Eren Yeager se junta à luta para combater as criaturas.");
        minhaSerie.informacoesSerie();

        System.out.print("\n");

        Serie outraSerie = new Serie("Blue lock",2022,1,24,23,0,"2018, Copa do Mundo, a seleção japonesa é eliminada nas oitavas. Em resposta, a União Japonesa de Futebol constrói Blue Lock, um alojamento de treinamento no qual 300 atacantes do ensino médio são reunidos com o objetivo de conquistarem a Copa do Mundo.");
        outraSerie.informacoesSerie();

        ArrayList<Serie> listaDeSeries = new ArrayList<>(); //estrutura de dados lista
        listaDeSeries.add(minhaSerie);
        listaDeSeries.add(outraSerie);
        System.out.println("Primeira série da lista: " +listaDeSeries.get(0).toString());
        System.out.println("Tamanho da lista: " +listaDeSeries.size());
        System.out.println(listaDeSeries);

        System.out.print("\n");

        CalculadoraDeTempo calc = new CalculadoraDeTempo();
        calc.incluiTempoFilme(listaDeFilmes);
        calc.incluiTempoSerie(listaDeSeries);
        calc.tempoDeTudo();

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio(1,"Para você 2000, anos no futuro",minhaSerie,200);
        recomendacao.filtra(episodio);
    }
}