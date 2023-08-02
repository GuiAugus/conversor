package conversorMoedas;

import javax.swing.*;

public class ConverteMoedasReais {
	
	public void converterDolarParaReais(double valorRecebido) {
		double moedaReal = valorRecebido * 4.79;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReal + " Reais");
	}
	
	public void converterEuroParaReais(double valorRecebido) {
		double moedaReal = valorRecebido * 5.41;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReal + " Reais");
	}
	
	public void converterLibrasEsterlinasParaReais(double valorRecebido) {
		double moedaReal = valorRecebido * 6.44;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReal + " Reais");
	}
	
	public void converterPesoArgentinoParaReais(double valorRecebido) {
		double moedaReal = valorRecebido * 0.22;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReal + " Reais");
	}
	
	public void converterPesoChilenoParaReais(double valorRecebido) {
		double moedaReal = valorRecebido * 0.71;
		moedaReal = (double) Math.round(moedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaReal + " Reais");
	}

}
