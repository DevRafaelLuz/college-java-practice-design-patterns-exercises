public class Cliente {
    public static void main(String[] args) throws Exception {
        CriadorApolice criadorAuto = new CriadorAuto();
        Apolice auto = criadorAuto.criarApolice();
        auto.numeroApolice = 1;
        auto.segurado = "Felipe";
        auto.premio = 200;
        auto.calcularPremio();
        auto.validarCobertura();
        auto.listarDocumentos();
        System.out.println(auto.gerarResumo());

        CriadorApolice criadorResidencial = new CriadorResidencial();
        Apolice residencial = criadorResidencial.criarApolice();
        residencial.numeroApolice = 2;
        residencial.segurado = "João";
        residencial.premio = 1000;
        residencial.calcularPremio();
        residencial.validarCobertura();
        residencial.listarDocumentos();
        System.out.println(residencial.gerarResumo());

        CriadorApolice criadorVida = new CriadorVida();
        Apolice vida = criadorVida.criarApolice();
        vida.numeroApolice = 3;
        vida.segurado = "Maria";
        vida.premio = 550;
        vida.calcularPremio();
        vida.validarCobertura();
        vida.listarDocumentos();
        System.out.println(vida.gerarResumo());

        CriadorApolice criadorViagem = new CriadorViagem();
        Apolice viagem = criadorViagem.criarApolice();
        viagem.numeroApolice = 4;
        viagem.segurado = "José";
        viagem.premio = 20;
        viagem.calcularPremio();
        viagem.validarCobertura();
        viagem.listarDocumentos();
        System.out.println(viagem.gerarResumo());
    }
}
