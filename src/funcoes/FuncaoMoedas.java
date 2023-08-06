package funcoes;

import javax.swing.JOptionPane;

import moedas.ConverteParaReais;
import moedas.ConverteMoedas;

public class FuncaoMoedas {

	ConverteParaReais moedas = new ConverteParaReais();
	ConverteMoedas reais = new ConverteMoedas();
	
	public void converterMoeda(double valorRecebido) {
		String option = (JOptionPane.showInputDialog(null, "Escolha a moeda para qual deseja converter seu dinheiro", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
				"Selecionar",
				"De Real para Dólar",
				"De Real para Euro",
				"De Real para Peso Argentino",
				"De Real para Peso Chileno",
				"De Real para Libra Eterlina",
				"De Dólar para Real",
				"De Euro para Real",
				"De Peso Argentino para Real",
				"De Peso Chileno para Real",
				"De Libra Esterlina para Real"}, "Escolha" )).toString();
	
		switch(option) {
			case "De Real para Dólar":
				moedas.converterRealParaDolar(valorRecebido);
				break;
			case "De Real para Euro":
				moedas.converterRealParaEuro(valorRecebido);
				break;
			case "De Real para Peso Argentino":
				moedas.converterRealParaPesoArgentino(valorRecebido);
				break;
			case "De Real para Peso Chileno":
				moedas.converterRealParaPesoChileno(valorRecebido);
				break;
			case "De Real para Libras":
				moedas.converterRealParaLibras(valorRecebido);
				break;
			case "De Dólar para Real":
				reais.converterDolarParaReal(valorRecebido);
				break;
			case "De Euro para Real":
				reais.converterEuroParaReal(valorRecebido);
				break;
			case "De Peso Argentino para Real":
				reais.converterPesoArgentinoParaReal(valorRecebido);
				break;
			case "De Peso Chileno para Real":
				reais.converterPesoChilenoParaReal(valorRecebido);
				break;
			case "De Libras para Real":
				reais.converterLibrasParaReal(valorRecebido);
				break;
		}
	}
}