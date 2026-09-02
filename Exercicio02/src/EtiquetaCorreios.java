public class EtiquetaCorreios implements EtiquetaEnvio {

    @Override
    public String gerarEtiqueta(Pedido pedido) {
        return "[Correios] CEP destino: " + pedido.cepDestino + " (Formato: 00000-000)";
    }

}
