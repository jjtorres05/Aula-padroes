public class ControleAdapter extends ControleDeponto {

    private ControleDePontoNovo c = new ControleDePontoNovo;

    public void RegistrarEntrada(Funcionario f){

        c.registrar(f,true);
    }

    public void RegistrarSaida(Funcionario f){

        c.registrar(f,false);
    }

}