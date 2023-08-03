package conversorTemperatura;

import conversorTemperatura.conversorTemperatura;

import javax.swing.*;

public class funcaoTemperatura {

	conversorTemperatura temperatura = new conversorTemperatura();

	public void converterTemperatura(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null,
		 "Escolha a temperatura que quer converter ",
         "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
                new Object[] {"Celsius para Fahrenheit",
				"Celsius para Kelvin",
				"Fahrenheit para Celsius",
				"Fahrenheit para Kelvin",
				"Kelvin para Celsius",
				"Kelvin para Fahrenheit"},
				"Escolha")).toString();
			
		switch(opcao) {
		case "Celsius para Fahrenheit":
			temperatura.converterCparaF(valorRecebido);
		    break;

		case "Celsius para Kelvin":
			temperatura.converterCparaK(valorRecebido);
		    break;
			
		case "Fahrenheit para Celsius":
			temperatura.converterFparaC(valorRecebido);
			break;

		case "Fahrenheit para Kelvin":
			temperatura.converterFparaK(valorRecebido);
			break;

		case "Kelvin para Celsius":
			temperatura.converterKparaC(valorRecebido);
			break;

		case "Kelvin para Fahrenheit":
			temperatura.converterKparaF(valorRecebido);
			break;		
		}	
	}
}