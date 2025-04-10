import java.util.*;

public class CartaoDeCredito {
    private double saldo;
    private final List<Compras> compras; //aqui a lista eh apenas criada porem sem criar o objeto

    public CartaoDeCredito(double limite){
        this.saldo = limite;
        this.compras = new LinkedList<>(); //as compras feitas entram agr na lista ligada
    }

    public boolean lancaCompra(Compras compra){
        if(this.saldo > compra.getPreco()){
            this.saldo -= compra.getPreco();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }
}
