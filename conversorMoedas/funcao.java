package conversorMoedas;

import conversorMoedas.ConverteMoedas;

import javax.swing.*;

public class funcao {
	
	ConverteMoedas moedas = new ConverteMoedas();
	
	public void converterMoeda(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja girar seu dinheiro ",
                "Moedas", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Dolar"}, "Escolha")).toString();
		
		switch (opcao) {
		case "Dolar":
			moedas.converterDolar(valorRecebido);
		}
	}

}
