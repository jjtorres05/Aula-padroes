package br.uel.adapter;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		ControleDePonto controleDePonto = 
				new br.uel.adapter.ControleDePontoNovo();
		Funcionario funcionario = 
				new Funcionario("Jo�o de Souza");
		controleDePonto.registrarEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registrarSaida(funcionario);
		
		
	}

}
