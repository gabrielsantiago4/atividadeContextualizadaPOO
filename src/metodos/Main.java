package metodos;

public class Main {
	
	public static void main(String[] args) {
		
		Calculo opera��o = new Calculo();
		
		
		int soma = opera��o.somar(10, 20);
		int subtra��o = opera��o.subtrair(soma, 20);
		int multiplica��o = opera��o.multiplicar(subtra��o, 20);
		int divis�o = opera��o.dividir(multiplica��o, 20);
		
		System.out.println(divis�o);

		
	}
}
