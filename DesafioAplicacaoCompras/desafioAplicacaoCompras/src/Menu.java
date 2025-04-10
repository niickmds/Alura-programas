import java.util.*;

public class Menu implements Comparable<Compras> { //comparar a compra do menu com o da "Compras"
    private final Scanner scanner = new Scanner(System.in);
    private double limite;
    private CartaoDeCredito cartao;

    public void limiteCartao(){
        do {
            System.out.print("Digite o limite do cartão: ");
            limite = scanner.nextDouble();
            if (limite <= 0) {
                System.out.println("Valor inválido. Por favor, digite um valor maior que zero.");
            } else {
                cartao = new CartaoDeCredito(limite);
                break;
            }
        }while (true);
    }

    public void interagirMenu(){
        do{
            System.out.println("Digite o nome do item ou 'sair' para encerrar: ");
            String item = scanner.next();

            if(item.equalsIgnoreCase("sair")){
                break;
            }

            System.out.print("Digite o valor da compra: ");
            double preco = scanner.nextDouble();

            Compras compra = new Compras(preco, item);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if(compraRealizada){
                System.out.println("Compra realizada!");
                double saldo = cartao.getSaldo();
                System.out.println("Seu novo saldo é de "+saldo);
            }else{
                System.out.println("Saldo insuficiente!");
                break;
            }
        }while(true);

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        List<Compras> compras = cartao.getCompras();
        compras.sort(Comparator.comparing(Compras::getPreco));
        for (Compras c : cartao.getCompras()) {
            System.out.println(c.getItens() + " - " +c.getPreco());
        }
        System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.compare(preco(), outraCompra.getPreco());
    }

    private double preco() {
        return 0;
    }
}