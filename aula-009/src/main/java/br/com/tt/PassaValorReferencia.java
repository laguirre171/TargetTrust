package br.com.tt;

public class PassaValorReferencia {
	public static void main(String[] args) {
		Produto p = new Produto();
		p.setValor(100);
		calcular(p);
		System.out.println("Valor de p = " + p.getValor());

	}

	private static void calcular(Produto args) {
		// TODO Auto-generated method stub
		if (args.getValor()>0 && args.getValor()<2000){
			args.setValor(55);
		}
		System.out.println("Valor de args = " + args.getValor());
	}
}
