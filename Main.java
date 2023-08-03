
import javax.swing.*;

import conversorMoedas.funcao;
import conversorTemperatura.funcaoTemperatura;
import conversorComprimento.funcaoComprimento;


public class Main {
    public static void main(String[] args) {
    	funcao moeda = new funcao();
    	funcaoComprimento comprimento = new funcaoComprimento();
    	funcaoTemperatura temperatura = new funcaoTemperatura();

        while (true) {

            String opcao = JOptionPane.showInputDialog(null,
			 "Escolha uma opção ", "Menu",
			 JOptionPane.PLAIN_MESSAGE,
			 null, 
			 		new Object[]{"Conversor de Moeda",
            		"Conversor de Comprimento",
					"Conversor de Temperatura"},
					"Escolha").toString();

            switch (opcao) {
                case "Conversor de Moeda":
                	String input = JOptionPane.showInputDialog("Insira o valor: ");
                	if (check(input)) {
                		double valorRecebido = Double.parseDouble(input);
                		moeda.converterMoeda(valorRecebido);
                		
                		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
                		if (JOptionPane.OK_OPTION == resposta) {
                			System.out.println(" "); 
                		} else {
                			JOptionPane.showMessageDialog(null, "Programa finalizado");
                		}
                	}else {
                		JOptionPane.showMessageDialog(null, "Opcao inválida");
                	}
                	break;
                	
                case "Conversor de Comprimento":
                	String inputComp = JOptionPane.showInputDialog("Insira um valor: ");
                	if (check(inputComp)) {
                		double valorRecebido = Double.parseDouble(inputComp);
                		comprimento.converterComprimento(valorRecebido);
                		
                		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
                		if (JOptionPane.OK_OPTION == resposta) {
                			System.out.println(" "); 
                		} else {
                			JOptionPane.showMessageDialog(null, "Programa finalizado");
                		}
                	}else {
                		JOptionPane.showMessageDialog(null, "Opcao inválida");
                	}
                	break;
                	
                case "Conversor de Temperatura":
                	String inputTemp = JOptionPane.showInputDialog("Insira um valor: ");
                	if (check(inputTemp)) {
                		double valorRecebido = Double.parseDouble(inputTemp);
                		temperatura.converterTemperatura(valorRecebido);

                		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
                		if (JOptionPane.OK_OPTION == resposta) {
                			System.out.println(" ");                		}
                	} else {
                		JOptionPane.showConfirmDialog(null, "Opcao Inválida");
                	}
                	break;                		
                }
            }
        }  
    
    public static boolean check(String input) {
    	try {
    		double x = Double.parseDouble(input);
    		if (x >= 0 || x < 0);
    		return true;    		
    	} catch (NumberFormatException e) {
    		return false;
    	}
    }
}