package view;

import javax.swing.JOptionPane;

import funcoes.FuncaoMoedas;
import funcoes.FuncaoTemperatura;
import funcoes.FuncaoTempo;

public class Main {
	public static void main(String[] args) {
		FuncaoMoedas moedas = new FuncaoMoedas();
		FuncaoTemperatura temperatura = new FuncaoTemperatura();
		FuncaoTempo tempo = new FuncaoTempo();

		while (true) {

			String option = JOptionPane.showInputDialog(
					null, "Escolha uma opção ", "Conversor ONE", JOptionPane.PLAIN_MESSAGE, null, new Object[] {
							"Selecionar", "Conversor de Moeda", "Conversor de Temperatura", "Conversor de Tempo" },
					"Escolha").toString();

			switch (option) {
			case "Conversor de Moeda":
				String input = JOptionPane.showInputDialog("Insira um valor para converter");
				if (check(input)) {
					double valorRecebido = Double.parseDouble(input);
					moedas.converterMoeda(valorRecebido);
					
					int resposta = 0;
					resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					if ((resposta == 0) && (check(input))) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						System.exit(0);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;

			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Insira um valor para converter");
				if (check(input)) {
					double valorRecebido = Double.parseDouble(input);
					temperatura.converterTemperatura(valorRecebido);

					int resposta = 0;
					resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					if ((resposta == 0) && (check(input))) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						System.exit(0);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;

			case "Conversor de Tempo":
				input = JOptionPane.showInputDialog("Insira um valor para converter");
				if (check(input)) {
					int valorRecebido = Integer.parseInt(input);
					tempo.converterTempo(valorRecebido);

					int resposta = 0;
					resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
					if ((resposta == 0) && (check(input))) {
					} else {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						System.exit(0);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			}
		}
	}

	private static boolean check(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}