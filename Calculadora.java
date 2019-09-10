public class Calculadora{
	
	int numero1 , numero2;
	int obterResto(int x, int y){
		
		int quociente = x / y;
		resto = x - quociente * y;
		
		return resto;
		/** 
		Metodo que calcula o resto da divisao de cada posição de dois vetores, posição a posição e imprima o resto de cada divisão.
		*/
	}
	void imprimirResto(
		
	 public static void main(String[] args) {
		 int tamanho = 5;
		 int [] vetx = {6,4,2,8,9}
		 int [] vety = {7,9,4,5,1}
	
		Calculadora calc = new Calculadora();
		calc.numero1 = 10;
		calc.numero2 = 3;
		int resto = calc.obterResto(calc.numero1, calc.numero2);
		System.out.println(string.format("0 resto da divisao de %d por %d e %d", calc.numero1,calc.numero2, resto));

	
	 }
}