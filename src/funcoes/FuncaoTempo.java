package funcoes;

import javax.swing.JOptionPane;

import tempo.ConverteTempo;

public class FuncaoTempo {
	ConverteTempo tempo = new ConverteTempo();

	public void converterTempo(int valorRecebido) {
		String option = (JOptionPane.showInputDialog(null, "Escolha uma opção para converter", "Tempo",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Selecionar", "Horas para Minutos", "Horas para Segundos", "Minutos para Horas",
						"Minutos para Segundos", "Segundos para Horas", "Segundos para Minutos" },
				"Escolha")).toString();
		switch (option) {
		case "Horas para Minutos":
			tempo.converterHorasParaMinutos(valorRecebido);
			break;
		case "Horas para Segundos":
			tempo.converterHorasParaSegundos(valorRecebido);
			break;
		case "Minutos para Horas":
			tempo.converterMinutosParaHoras(valorRecebido);
			break;
		case "Minutos para Segundos":
			tempo.converterMinutosParaSegundos(valorRecebido);
			break;
		case "Segundos para Horas":
			tempo.converterSegundosParaHoras(valorRecebido);
			break;
		case "Segundos para Minutos":
			tempo.converterSegundosParaMinutos(valorRecebido);
			break;
		}
	}

}
