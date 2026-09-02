import java.time.LocalDate;
import java.util.List;

public abstract class Apolice {
    protected int numeroApolice;
    protected String segurado;
    protected LocalDate dataEmissao = LocalDate.now();
    protected double premio;

    public abstract double calcularPremio();
    public abstract boolean validarCobertura();
    public abstract List<String> listarDocumentos();

    public String gerarResumo() {
        return "Apólice: " + this.numeroApolice + 
               "\nSegurado: " + this.segurado +
               "\nEmissão: " + this.dataEmissao +
               "\nPrêmio: " + this.premio +
               "\nDocumentos: " + this.listarDocumentos();
    }
}
