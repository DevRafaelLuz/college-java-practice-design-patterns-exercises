public class USAFactory implements CheckoutFactory {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new SalesInvoice();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoCartaoCredito();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaUSPS();
    }

}
