package view;
import controller.ControllerSerieFibonacci;
import javax.swing.JOptionPane;
public class PrincipalSerieFibonacci {
	public static void main (String [] args) {
		
		ControllerSerieFibonacci m = new ControllerSerieFibonacci();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite uma posição da série de fibonacci: "));
		int resp = m.SerieFibonacci(num);
		System.out.println("O valor na posição " + num + " da série de Fibonacci é: " + resp);
	}

}
