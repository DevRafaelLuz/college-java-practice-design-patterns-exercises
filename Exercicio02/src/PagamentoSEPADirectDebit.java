public class PagamentoSEPADirectDebit implements ProcessadorPagamento {

    @Override
    public String processar(Pedido pedido) {
        return "[SEPA] Direct Debit processado com sucesso. Valor debitado: € " + pedido.valorBase;
    }

}
