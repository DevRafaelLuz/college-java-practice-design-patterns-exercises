public class CriadorResidencial extends CriadorApolice {

    @Override
    public Apolice criarApolice() {
        return new ApoliceResidencial();
    }

}
