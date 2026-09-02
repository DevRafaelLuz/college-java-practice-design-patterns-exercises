public class AlemanhaFactory implements CheckoutFactory {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new VATInvoice();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoSEPADirectDebit();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaDeutschePost();
    }

}
