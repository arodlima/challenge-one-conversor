package moedas;

import javax.swing.JOptionPane;

public class ConverteMoedas {

	public void converterDolarParaReal(double valorRecebido) {
		double moedaDolar = valorRecebido / 4.79;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " Dólares");
	}

	public void converterEuroParaReal(double valorRecebido) {
		double moedaEuro = valorRecebido / 5.38;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem € " + moedaEuro + " Euros");
	}

	public void converterPesoArgentinoParaReal(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido / 0.018;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + " Pesos Argentinos");
	
	}

	public void converterPesoChilenoParaReal(double valorRecebido) {
		double moedaPesoChileno = valorRecebido / 0.0059;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Pesos Chilenos");
	
	}

	public void converterLibrasParaReal(double valorRecebido) {
		double moedaLibra = valorRecebido / 6.27;
		moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem € " + moedaLibra + " Libras Esterlinas");	
	}
}
