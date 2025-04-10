public class Compras {

    private final double preco;
    private final String itens;

    public Compras(double preco, String itens) {
        this.preco = preco;
        this.itens = itens;
    }

    public double getPreco() {
        return preco;
    }

    public String getItens() {
        return itens;
    }

    @Override
    public String toString() {
        return "Compra: Descrição = "+itens+ " valor = "+preco;
    }
}