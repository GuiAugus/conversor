package conversorMoedas;

import conversorMoedas.ConverteMoedas;

import javax.swing.*;

public class funcao {
	
	ConverteMoedas moedas = new ConverteMoedas();
	
	public void converterMoeda(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja girar seu dinheiro ",
                "Moedas", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Reais para Dolar",
                		"Reais para Euro",
                		"Reais para Libras Esterlinas",
                		"Reais para Peso Argentino",
                		"Reais para Peso Chileno"
                		}, "Escolha")).toString();
		
		switch (opcao) {
		case "Reais para Dolar":
			moedas.converterDolar(valorRecebido);
			break;
			
		case "Reais para Euro":
			moedas.converterEuro(valorRecebido);
			break;
			
		case "Reais para Libras Esterlinas":
			moedas.converterLibrasEsterlinas(valorRecebido);
			break;
			
		case "Reais para Peso Argentino":
			moedas.converterPesoArgentino(valorRecebido);
			break;
			
		case "Reais para Peso Chileno":
			moedas.converterPesoChileno(valorRecebido);
			break;
		
		}
	}

}
