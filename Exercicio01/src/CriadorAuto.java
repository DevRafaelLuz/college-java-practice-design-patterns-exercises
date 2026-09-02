public class CriadorAuto extends CriadorApolice {

    @Override
    public Apolice criarApolice() {
        return new ApoliceAuto();
    }

}
