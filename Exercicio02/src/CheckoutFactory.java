public interface CheckoutFactory {
    DocumentoFiscal criarDocumentoFiscal();
    ProcessadorPagamento criarProcessadorPagamento();
    EtiquetaEnvio criarEtiquetaEnvio();
}
