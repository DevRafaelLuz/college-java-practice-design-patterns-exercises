import java.util.List;

public class ApoliceResidencial extends Apolice {
    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiEscrituraOuContrato;

    @Override
    public double calcularPremio() {
        double premioAnual = 0.015 * valorImovel;
        if (altoPadrao) {
            premioAnual *= 1.25;
        }
        return this.premio = premioAnual / 12;
    }

    @Override
    public boolean validarCobertura() {
        return possuiEscrituraOuContrato;
    }

    @Override
    public List<String> listarDocumentos() {
        return List.of("Escritura ou contrato de locação", "Comprovante de residência");
    }

}
