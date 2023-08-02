package conversorComprimento;

import conversorComprimento.conversorComprimento;

import javax.swing.*;

public class funcaoComprimento {
	
	conversorComprimento comprimento = new conversorComprimento();
	
	public void converterComprimento(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a medida que quer converter ",
                "Comprimento", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"M para CM",
                		"M para KM",
                		"CM para M",
                		"CM para KM",
                		"KM para CM",
                		"KM para M"
                		}, "Escolha")).toString();
		
		switch(opcao) {
		case "M para CM":
			comprimento.ConverterMparaCM(valorRecebido);
			break;
			
		case "M para KM":
			comprimento.ConverterMparaKM(valorRecebido);
			break;
			
		case "CM para M":
			comprimento.ConverterCMparaM(valorRecebido);
			break;
		
		case "CM para KM":
			comprimento.ConverterCMparaKM(valorRecebido);
			break;
			
		case "KM para CM":
			comprimento.ConverterKMparaCM(valorRecebido);
			break;
			
		case "KM para M":
			comprimento.ConverterKMparaM(valorRecebido);
			break;
		}
	}		
}


