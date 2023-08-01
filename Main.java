
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        while (true) {

            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opção ", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda"}, "Escolha").toString();

            switch (opcao) {
                case "Conversor de Moeda":
                	String input = JOptionPane.showInputDialog("Insira o valor: ");
                	System.out.println(input);
                	if (check(input)) {
                		System.out.println("Numero");
                	}else {
                		System.out.println("String");
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