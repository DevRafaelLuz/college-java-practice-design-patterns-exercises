public class BrasilFactory implements CheckoutFactory {

    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NFe();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoPixBoleto();
    }

    @Override
    public EtiquetaEnvio criarEtiquetaEnvio() {
        return new EtiquetaCorreios();
    }

}
