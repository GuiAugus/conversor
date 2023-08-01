package conversorMoedas;

import javax.swing.*;

public class ConverteMoedas {

	public void converterDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 4.79;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dólares");
	}
	
	public void converterEuro(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.41;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " Euros");
	}
	
	public void converterLibrasEsterlinas(double valorRecebido) {
		double moedaLibrasEsterlinas = valorRecebido / 6.44;
		moedaLibrasEsterlinas = (double) Math.round(moedaLibrasEsterlinas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibrasEsterlinas + " Libras Esterlinas");
	}
	
	public void converterPesoArgentino(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido / 0.22;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + " Peso Argentino");
	}
	
	public void converterPesoChileno(double valorRecebido) {
		double moedaPesoChileno = valorRecebido / 0.71;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Peso Chileno");
	}

}
