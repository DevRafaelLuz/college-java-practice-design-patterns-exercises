import java.util.Random;

public class NFe implements DocumentoFiscal {

    @Override
    public String gerar(Pedido pedido) {
        boolean isInterestadual = !pedido.estadoOrigem.equalsIgnoreCase(pedido.estadoDestino);
        String cfop = isInterestadual ? "6.102" : "5.102";
        int icms = isInterestadual ? 12 : 18;
        String chave = gerarChaveAcessoFalsa();
        return "[NFe] CFOP: " + cfop + " | ICMS: " + icms + " | Chave: " + chave;
    }

    private String gerarChaveAcessoFalsa() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 44; i++) { 
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
