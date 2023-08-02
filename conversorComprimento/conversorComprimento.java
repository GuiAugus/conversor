package conversorComprimento;

import javax.swing.*;

public class conversorComprimento {
	
	public void ConverterMparaCM(double valorRecebido) {
		double cm = valorRecebido * 100;
		JOptionPane.showMessageDialog(null, valorRecebido + "m = " + cm + "cm");	
	}
	
	public void ConverterMparaKM(double valorRecebido) {
		double km = valorRecebido / 1000;
		JOptionPane.showMessageDialog(null, valorRecebido + "m = " + km + "km");	
	}
	
	public void ConverterCMparaM(double valorRecebido) {
		double m = valorRecebido / 100;
		JOptionPane.showMessageDialog(null, valorRecebido + "cm = " + m + "m");	
	}
	
	public void ConverterCMparaKM(double valorRecebido) {
		double cm = valorRecebido * 100000;
		JOptionPane.showMessageDialog(null, valorRecebido + "M = " + cm + "cm");	
	}
	
	public void ConverterKMparaCM(double valorRecebido) {
		double km = valorRecebido / 100000;
		JOptionPane.showMessageDialog(null, valorRecebido + "M = " + km + "cm");	
	}
	
	public void ConverterKMparaM(double valorRecebido) {
		double m = valorRecebido * 1000;
		JOptionPane.showMessageDialog(null, valorRecebido + "M = " + m + "cm");	
	}
	
}
