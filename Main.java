
import javax.swing.*;

import conversorMoedas.funcao;

public class Main {
    public static void main(String[] args) {
    	funcao moeda = new funcao();

        while (true) {

            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda"}, "Escolha").toString();

            switch (opcao) {
                case "Conversor de Moeda":
                	String input = JOptionPane.showInputDialog("Insira o valor: ");
                	System.out.println(input);
                	if (check(input)) {
                		double valorRecebido = Double.parseDouble(input);
                		moeda.converterMoeda(valorRecebido);
                		
                		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar? ");
                		if (JOptionPane.OK_OPTION == resposta) {
                			System.out.println("Escolha opcão"); 
                		}                		
                	}else {
                		JOptionPane.showMessageDialog(null, "Opcao inválida");
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