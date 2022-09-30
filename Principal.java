import javax.swing.JOptionPane;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		
		//System.out.print("Ingrese los datos de la Persona: ");
		Persona p = new Persona();
		String name = JOptionPane.showInputDialog("Ingrese su nombre: ");
		p.setNombre(name);
		//p.setNombre(sc.nextLine());
		double esta= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la estatura: "));
		p.setEstatura(esta);
		//System.out.print("Ingrese la estatura: ");
		//p.setEstatura(sc.nextDouble());
		double pes= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso: "));
		p.setPeso(pes);
		//System.out.print("Ingrese el peso: ");
		//p.setPeso(sc.nextDouble());
		
		Operando op = new Operando();
		op.calcularIMC(p);

	}

}
