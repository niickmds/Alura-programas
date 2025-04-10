package screenmatch.main;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.*;

public class MainComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Carros",2006,117,"Brian Fee","Ao viajar para a Califórnia, o famoso carro de corridas Relâmpago McQueen se perde e vai parar em Radiator Springs, uma cidadezinha na Rota 66. Ele conhece novos amigos e aprende lições que mudam sua forma de encarar a vida.");
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Duna 2",2024,166,"Denis Villneuve","Paul Atreides se une a Chani e aos Fremen enquanto busca vingança contra os conspiradores que destruíram sua família. Enfrentando uma escolha entre o amor de sua vida e o destino do universo, ele deve evitar um futuro terrível que só ele pode prever.");
        outroFilme.avalia(6);

        var porraFilme =  new Filme("Garfield",2024,101,"Mark Dindal","Garfield tem um reencontro inesperado com seu pai, que estava há muito tempo desaparecido - um gato de rua todo desengonçado que atrai o filho para um assalto de alto risco.");
        porraFilme.avalia(10);

        Serie minhaSerie = new Serie("Attack on Titan",2013,4,20,23,0,"Para escapar dos titãs, gigantes devoradores de homens, a humanidade se refugiou em cidades cercadas por enormes muralhas. Quando eles voltam a atacar, Eren Yeager se junta à luta para combater as criaturas.");
        Serie outraSerie = new Serie("Blue lock",2022,1,24,23,0,"2018, Copa do Mundo, a seleção japonesa é eliminada nas oitavas. Em resposta, a União Japonesa de Futebol constrói Blue Lock, um alojamento de treinamento no qual 300 atacantes do ensino médio são reunidos com o objetivo de conquistarem a Copa do Mundo.");

        List<Titulo> listadeAssistidos = new LinkedList<>(); //estrutura de dados lista
        listadeAssistidos.add(meuFilme);
        listadeAssistidos.add(outroFilme);
        listadeAssistidos.add(porraFilme);
        listadeAssistidos.add(minhaSerie);
        listadeAssistidos.add(outraSerie);

        for(Titulo item : listadeAssistidos){
            System.out.println(item);

            if(item instanceof Filme filme) { //se a instancia de item for a classe Filme ele faz isso
                System.out.printf("Classificação: %.1f \n\n", filme.getClassificacao());
            }
        }

        List<String> buscasPorArtistas = new LinkedList<>();
        buscasPorArtistas.add("Sydney Sweeney");
        buscasPorArtistas.add("Adam Sandler");
        buscasPorArtistas.add("Michael Scott");
        System.out.println("Antes da ordenação: "+buscasPorArtistas);

        Collections.sort(buscasPorArtistas); //collections.sort poe em ordem alfabetica
        System.out.println("Depois da ordenação: "+buscasPorArtistas);

        Collections.sort(listadeAssistidos);
        System.out.println("Lista de filmes e serie em ordem alfabética: "+listadeAssistidos);

        listadeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Lista em ordem crescente de ano de lançamento: "+listadeAssistidos);

        listadeAssistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento).reversed());
        System.out.println("Lista em ordem decrescente de ano de lançamento: "+listadeAssistidos);
    }
}