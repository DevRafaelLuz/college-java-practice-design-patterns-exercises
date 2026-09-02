import java.util.List;

public class ApoliceAuto extends Apolice {
    private double valorTabelaFipe;
    private int idadeCondutor;
    private int anosHabilitacao;
    private double coberturaTerceiros;

    @Override
    public double calcularPremio() {
        double base = (0.08 * valorTabelaFipe) / 12;
        double acrescimo = 1.0;
        if (idadeCondutor < 25) { acrescimo += 0.30; }
        if (anosHabilitacao < 2) { acrescimo += 0.20; }
        this.premio = base * acrescimo;
        return this.premio;
    }

    @Override
    public boolean validarCobertura() {
        return coberturaTerceiros >= 50000.0;
    }

    @Override
    public List<String> listarDocumentos() {
        return List.of("CNH", "CRLV", "Comprovante de residência");
    }

}
