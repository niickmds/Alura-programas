package screenmatch.calculos;

public class Recomendacao {

    public void filtra(Classificavel classificavel){
        double classificacao = classificavel.getClassificacao();

        System.out.print("\nTotal de estrelas: " +classificacao);

        if(classificacao >= 4){
            System.out.println("\nEstá entre os preferidos.");
        } else if (classificacao >= 2) {
            System.out.println("\nMuito bem avaliado no momento.");
        } else {
            System.out.println("\nColoque na lista para assistir depois.");
        }
    }
}
