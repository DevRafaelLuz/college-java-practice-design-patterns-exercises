import java.util.ArrayList;
import java.util.List;

public class ApoliceViagem extends Apolice {
    private int diasViagem;
    private boolean destinoInternacional;
    private double coberturaAssistenciaMedica;
    private boolean possuiPassaporte;

    @Override
    public double calcularPremio() {
        double base = diasViagem * 15.0;
        if (destinoInternacional) {
            base += 100.0;
        }
        this.premio = base;
        return this.premio;
    }

    @Override
    public boolean validarCobertura() {
        if (destinoInternacional) {
            return coberturaAssistenciaMedica >= 30_000.0 && possuiPassaporte;
        }
        return true;
    }

    @Override
    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>(List.of("Itinerário de viagem"));
        if (destinoInternacional) {
            docs.add("Passaporte");
        }
        return docs;
    }

}
