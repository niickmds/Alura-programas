package screenmatch.excecao;

public class ErrodeConversaoDeAnoExcpetion extends RuntimeException {

    private final String mensagem;
    public ErrodeConversaoDeAnoExcpetion(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
