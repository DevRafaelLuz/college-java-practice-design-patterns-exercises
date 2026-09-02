public class CriadorVida extends CriadorApolice {

    @Override
    public Apolice criarApolice() {
        return new ApoliceVida();
    }

}
