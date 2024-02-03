import java.util.Scanner;

import javax.swing.JOptionPane;
public class tabuada {

	public static void main(String[] args) {

		
		
				Integer numero;
				Integer continuar;

				Scanner sc = new Scanner(System.in);

				do {
								
				    numero = Integer.parseInt(JOptionPane.showInputDialog("Esse é seu programa de Tabuada"+ "\n" +"Informe o número da tabuada: "));

				    			for (Integer i = 0; i <= 10; i++)
						        JOptionPane.showMessageDialog(null, numero + " x " + i + " = " + (numero * i) + "\n");
							
					
					continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar com sistema?(1)Sim ou (0)Não: "));
	sc.close();				
					
				} while (continuar > 0);
	 }
	
}

		