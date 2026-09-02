public class Pedido {
    double valorBase;
    String estadoOrigem;
    String estadoDestino;
    String cepDestino;
    boolean produtoEssencial;
    String opcaoPagamentoLocal;

    public Pedido(double valorBase, String estadoOrigem, String estadoDestino, String cepDestino, boolean produtoEssencial, String opcaoPagamentoLocal) {
        this.valorBase = valorBase;
        this.estadoOrigem = estadoOrigem;
        this.estadoDestino = estadoDestino;
        this.cepDestino = cepDestino;
        this.produtoEssencial = produtoEssencial;
        this.opcaoPagamentoLocal = opcaoPagamentoLocal;
    }
}
