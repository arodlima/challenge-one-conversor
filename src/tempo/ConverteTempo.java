package tempo;

import javax.swing.JOptionPane;

public class ConverteTempo {

	public int converterHorasParaMinutos(int valorRecebido) {
		int minutos = valorRecebido * 60;
        JOptionPane.showMessageDialog(null, valorRecebido + " horas são " + minutos + " minutos.");
        return minutos;		
	}
	public int converterHorasParaSegundos(int horas) {
        int segundos = horas * 3600;
        JOptionPane.showMessageDialog(null, horas + " horas são " + segundos + " segundos.");
        return segundos;
    }

    public int converterMinutosParaHoras(int minutos) {
        int horas = minutos / 60;
        JOptionPane.showMessageDialog(null, minutos + " minutos são " + horas + " horas.");
        return horas;
    }

    public int converterMinutosParaSegundos(int minutos) {
        int segundos = minutos * 60;
        JOptionPane.showMessageDialog(null, minutos + " minutos são " + segundos + " segundos.");
        return segundos;
    }

    public int converterSegundosParaHoras(int segundos) {
        int horas = segundos / 3600;
        JOptionPane.showMessageDialog(null, segundos + " segundos são " + horas + " horas.");
        return horas;
    }

    public int converterSegundosParaMinutos(int segundos) {
        int minutos = segundos / 60;
        JOptionPane.showMessageDialog(null, segundos + " segundos são " + minutos + " minutos.");
        return minutos;
    }

}
