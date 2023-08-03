package conversorTemperatura;

import javax.swing.*;

public class conversorTemperatura {

	public void converterCparaF(double valorRecebido) {
		double f = (valorRecebido * 1.8) + 32;
		JOptionPane.showMessageDialog(null, valorRecebido + "C = " + f + "F");		
	}

	public void converterCparaK(double valorRecebido) {
		double k = valorRecebido + 273;
		JOptionPane.showMessageDialog(null, valorRecebido + "C = " + k + "K");
	}

	public void converterFparaC(double valorRecebido) {
		double c = (5 * (valorRecebido - 32)) / 9;
		JOptionPane.showMessageDialog(null, valorRecebido + "F = " + c + "C"); 
	}

	public void converterFparaK(double valorRecebido) {
		double f = ((valorRecebido * 1.8) + 32) + 273;
		JOptionPane.showMessageDialog(null, valorRecebido + "F = " + f + "K");
	}

	public void converterKparaC(double valorRecebido) {
		double c = valorRecebido - 273;
		JOptionPane.showMessageDialog(null, valorRecebido + "K = " + c + "C");
	}

	public void converterKparaF(double valorRecebido) {
		double f = ((valorRecebido * 1.8) + 32) + 273;
		JOptionPane.showMessageDialog(null, valorRecebido + "K = " + f + "F");
	}
}