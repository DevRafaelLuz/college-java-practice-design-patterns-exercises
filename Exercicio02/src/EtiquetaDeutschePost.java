public class EtiquetaDeutschePost implements EtiquetaEnvio {

    @Override
    public String gerarEtiqueta(Pedido pedido) {
        return "[Deutsche Post] PLZ: " + pedido.cepDestino + " (Formato 5 dígitos)";
    }

}
