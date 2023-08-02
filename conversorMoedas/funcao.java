package conversorMoedas;

import conversorMoedas.ConverteMoedas;
import conversorMoedas.ConverteMoedasReais;

import javax.swing.*;

public class funcao {
	
	ConverteMoedas moedas = new ConverteMoedas();
	ConverteMoedasReais reais = new ConverteMoedasReais();
	
	public void converterMoeda(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja girar seu dinheiro ",
                "Moedas", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Reais para Dolar",
                		"Reais para Euro",
                		"Reais para Libras Esterlinas",
                		"Reais para Peso Argentino",
                		"Reais para Peso Chileno",
                		"Dolar para Reais",
                		"Euro para Reais",
                		"Libras Esterlinas para Reais",
                		"Peso Argentino para Reais",
                		"Peso Chileno para Reais"}, "Escolha")).toString();
		
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
		
		case "Dolar para Reais":
			reais.converterDolarParaReais(valorRecebido);
			break;
			
		case "Euro para Reais":
			reais.converterEuroParaReais(valorRecebido);
			break;		
			
		case "Libras Esterlinas para Reais":
			reais.converterLibrasEsterlinasParaReais(valorRecebido);
			break;
		
		case "Peso Argentino para Reais":
			reais.converterPesoArgentinoParaReais(valorRecebido);
			break;
			
		case "Peso Chileno para Reais":
			reais.converterPesoChilenoParaReais(valorRecebido);
			break;
		}
	}

}
