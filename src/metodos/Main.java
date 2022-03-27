package metodos;

public class Main {
	
	public static void main(String[] args) {
		
		Calculo operacao = new Calculo();
		
		
		int soma = operacao.somar(10, 20);
		int subtracao = operacao.subtrair(soma, 20);
		int multiplicacao = operacao.multiplicar(subtracao, 20);
		int divisao = operacao.dividir(multiplicacao, 20);
		
		System.out.println(divisao);

		
	}
}
