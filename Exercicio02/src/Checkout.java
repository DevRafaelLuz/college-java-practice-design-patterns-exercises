public class Checkout {
    private CheckoutFactory factory;

    public Checkout(CheckoutFactory factory) {
        this.factory = factory;
    }

    public void finalizarPedido(Pedido pedido) {
        DocumentoFiscal documentoFiscal = factory.criarDocumentoFiscal();
        ProcessadorPagamento processadorPagamento = factory.criarProcessadorPagamento();
        EtiquetaEnvio etiqueta = factory.criarEtiquetaEnvio();

        System.out.println("====== RELATÓRIO DO PEDIDO ======");
        System.out.println("1. Documento Fiscal: " + documentoFiscal.gerar(pedido));
        System.out.println("2. Pagamento:        " + processadorPagamento.processar(pedido));
        System.out.println("3. Logística:        " + etiqueta.gerarEtiqueta(pedido));
        System.out.println("=================================\n");
    }
}
