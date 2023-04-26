package view;

import javax.swing.JOptionPane;

import controller.DigitosController;

public class Principal {

	public static void main(String[] args) {
		DigitosController digitosCont = new DigitosController();
		
		do {
			try {
				String input = JOptionPane.showInputDialog("Digite um número inteiro: ", "");
				if (input == null) {
					JOptionPane.showMessageDialog(null, "Encerrando");
					System.exit(0);
				}
				int num = Integer.parseInt(input);
				JOptionPane.showMessageDialog(null, "Número de digitos de " + num + " = " + digitosCont.digitos(num));
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Número inválido");
				continue;
			}
			break;
		} while(true);
	}

}
