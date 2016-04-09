package br.com.tt;

import javax.swing.JOptionPane;

public class Programa {

	static Double valor;
	static Double parcela;
	
	public static void main(String[] args) {
		try{
		System.out.println("Sistema de Compras");
		entradaDados(); //alt + shift + m
		Double total = calcular();
		mostrarResultado(total);
		}catch(Exception e){
			
		}
		
		//mostrarResultado(total);
		

	}

	private static void mostrarResultado(Double total) {
		JOptionPane.showMessageDialog(null, "Valor da parcela " + total);
	}

	private static Double calcular() throws Exception{
		try{
		Double total = (double) (valor/parcela);
		
		if (total.isInfinite()){
			throw new Exception("Falha ao calcular Parcela");
		}
		return total;
		}catch(Exception e){
			throw new Exception("Falha ao calcular Parcela");
		}
	}

	private static void entradaDados() throws Exception{
		try{
		valor = Double.parseDouble(
				JOptionPane.showInputDialog("Digite o valor: "));
		parcela = Double.parseDouble(
				JOptionPane.showInputDialog("Digite qtd parcelas: "));

		}catch(Exception e){
			System.out.println("Falha ao digitar o valor");
			
		}
	}
	

}
