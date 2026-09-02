public class SalesInvoice implements DocumentoFiscal {

    @Override
    public String gerar(Pedido pedido) {
        double rate = 0.0;
        if ("CA".equalsIgnoreCase(pedido.estadoDestino)) { 
            rate = 7.25; 
        } else if ("TX".equalsIgnoreCase(pedido.estadoDestino)) { 
            rate = 6.25; 
        }
        return "[Sales Invoice] Vendedor EIN: 98-7654321 | Sales Tax (%s): " + pedido.estadoDestino + " | Imposto U$ " + pedido.valorBase * (rate / 100);
    }

}
