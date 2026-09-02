public class EtiquetaUSPS implements EtiquetaEnvio {

    @Override
    public String gerarEtiqueta(Pedido pedido) {
        return "[USPS] Label: " + pedido.cepDestino + " (Formato ZIP+4)";
    }

}
