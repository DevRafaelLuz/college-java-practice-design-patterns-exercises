public class VATInvoice implements DocumentoFiscal {

    @Override
    public String gerar(Pedido pedido) {
        int rate = pedido.produtoEssencial ? 7 : 19;
        double totalTax = pedido.valorBase * (rate / 100.0);
        return String.format("[VAT Invoice] Seller VAT-ID: DE123456789 | Umsatzsteuer: " + rate + " | Imposto: € " + totalTax);
    }

}
