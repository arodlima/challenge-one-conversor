package funcoes;

import javax.swing.JOptionPane;

import temperatura.ConverteTemperatura;

public class FuncaoTemperatura {
	ConverteTemperatura temperatura = new ConverteTemperatura();

	public void converterTemperatura(double valorRecebido) {
		String option = (JOptionPane.showInputDialog(null, "Escolha uma opção para converter", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Selecionar", "Graus Celsius para Fahrenheit", "Graus Celsius para Kelvin",
						"Graus Fahrenheit para Celsius", "Kelvin para Graus Celsius", "Kelvin para Graus Fahrenheit" },
				"Escolha")).toString();
		switch (option) {
		case "Graus Celsius para Fahrenheit":
			temperatura.converterCelsiusParaFahrenheit(valorRecebido);
			break;
		case "Graus Celsius para Kelvin":
			temperatura.converterCelsiusParaKelvin(valorRecebido);
			break;
		case "Graus Fahrenheit para Celsius":
			temperatura.converterFahrenheitParaCelsius(valorRecebido);
			break;
		case "Kelvin para Graus Celsius":
			temperatura.converterKelvinParaCelsius(valorRecebido);
			break;
		case "Kelvin para Graus Fahrenheit":
			temperatura.converterKelvinParaFahrenheit(valorRecebido);
			break;
		}
	}
}