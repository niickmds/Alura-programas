import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorDeArquivo {

    public void salvaJson(List<Endereco> endereco) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escrita = new FileWriter("CEPs.Json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }
}
