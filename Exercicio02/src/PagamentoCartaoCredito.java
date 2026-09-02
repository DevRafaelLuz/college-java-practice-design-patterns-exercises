public class PagamentoCartaoCredito implements ProcessadorPagamento {

    @Override
    public String processar(Pedido pedido) {
        return "[Credit Card] Transação aprovada. Verificação AVS (Address Verification System) OK. Valor: U$ " + pedido.valorBase;
    }

}
