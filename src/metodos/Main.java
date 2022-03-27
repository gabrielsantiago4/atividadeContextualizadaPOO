package metodos;

public class Main {
	
	public static void main(String[] args) {
		
		Calculo operação = new Calculo();
		
		
		int soma = operação.somar(10, 20);
		int subtração = operação.subtrair(soma, 20);
		int multiplicação = operação.multiplicar(subtração, 20);
		int divisão = operação.dividir(multiplicação, 20);
		
		System.out.println(divisão);

		
	}
}
