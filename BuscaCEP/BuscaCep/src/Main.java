import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        List<Endereco> enderecos = new ArrayList<>();
        String cep = "";



        while(!cep.equalsIgnoreCase("sair")){

            System.out.print("Digite um CEP para consulta:");
            cep = leitura.nextLine();

            if(cep.equalsIgnoreCase("sair")){
                break;
            }

            try {
                Endereco novoEndereco = consultaCep.buscaEndereco(cep);
                System.out.println(novoEndereco);
                enderecos.add(novoEndereco);
                GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
                geradorDeArquivo.salvaJson(enderecos);
            }catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}