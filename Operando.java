import javax.swing.JOptionPane;

public class Operando {

	public void calcularIMC(Persona per) {
		
		double imc = per.getPeso()/(per.getEstatura()*per.getEstatura());
		JOptionPane.showMessageDialog(null, "El IMC de la persona "+per.getNombre()+" es: "+imc);
		

	}

}
