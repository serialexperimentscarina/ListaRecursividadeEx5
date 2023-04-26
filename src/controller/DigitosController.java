package controller;

public class DigitosController {

	public DigitosController() {
		super();
	}
	
	public int digitos(int num) {
		// Condição de parada: Quando o número tiver 1 digito
		if (Math.abs(num) < 10) {
			return 1;
		}
		// Função para o termo n em função do termo anterior: 1 + digitos(n / 10) + digitos((n / 10) / 10) ... + 1
		return 1 + digitos(num / 10);
		
	}

}
