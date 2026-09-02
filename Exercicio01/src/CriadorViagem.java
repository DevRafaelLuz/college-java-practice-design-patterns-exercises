public class CriadorViagem extends CriadorApolice {

    @Override
    public Apolice criarApolice() {
        return new ApoliceViagem();
    }

}
