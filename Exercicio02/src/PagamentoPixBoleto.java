public class PagamentoPixBoleto implements ProcessadorPagamento {

    @Override
    public String processar(Pedido pedido) {
        if ("PIX".equalsIgnoreCase(pedido.opcaoPagamentoLocal)) {
            double valorDesconto = pedido.valorBase * 0.95;
            return String.format("[PIX] Pagamento aprovado. Valor com 5%% desconto: R$ " + valorDesconto);
        }
        return "[BOLETO] Gerado. Valor: R$ " + pedido.valorBase + " | Compensação em 3 dias úteis.";        
    }

}
