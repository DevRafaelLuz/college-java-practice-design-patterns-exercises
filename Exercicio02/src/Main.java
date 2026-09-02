public class Main {
    public static void main(String[] args) {
        Pedido pedidoBrasil = new Pedido(1000.00, "SP", "RJ", "22041-001", false, "PIX");
        Checkout checkoutBrasil = new Checkout(new BrasilFactory());
        System.out.println(">>> Checkout Piloto: BRASIL");
        checkoutBrasil.finalizarPedido(pedidoBrasil);

        Pedido pedidoEstadosUnidos = new Pedido(500.00, "NY", "CA", "90210-1234", false, "CREDIT");
        Checkout checkoutEstadosUnidos = new Checkout(new USAFactory());
        System.out.println(">>> Checkout Piloto: ESTADOS UNIDOS");
        checkoutEstadosUnidos.finalizarPedido(pedidoEstadosUnidos);

        Pedido pedidoAlemanha = new Pedido(200.00, "DE", "DE", "10115", true, "SEPA");
        Checkout checkoutAlemanha = new Checkout(new AlemanhaFactory());
        System.out.println(">>> Checkout Piloto: ALEMANHA");
        checkoutAlemanha.finalizarPedido(pedidoAlemanha);
    }
}
