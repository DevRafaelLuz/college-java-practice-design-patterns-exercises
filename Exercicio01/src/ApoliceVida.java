import java.util.ArrayList;
import java.util.List;

public class ApoliceVida extends Apolice {
    private int idadeSegurado;
    private double capitalSegurado;
    private boolean fumante;
    private boolean possuiAtestadoMedico;

    @Override
    public double calcularPremio() {
        double base = (idadeSegurado * 12) + (capitalSegurado * 0.002);
        if (fumante) {
            base *= 1.5;
        }
        return this.premio = base;
    }

    @Override
    public boolean validarCobertura() {
        if (capitalSegurado > 500_000.0) {
            return possuiAtestadoMedico;
        }
        return true;
    }

    @Override
    public List<String> listarDocumentos() {
        List<String> docs = new ArrayList<>(List.of("Documento de identidade", "CPF"));
        if (capitalSegurado > 500_000.0) {
            docs.add("Atestado médico");
        }
        return docs;
    }

}
