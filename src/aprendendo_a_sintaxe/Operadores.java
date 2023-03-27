package aprendendo_a_sintaxe;

public class Operadores {

	public static void main(String[] args) {

		int a, b;
		a = 3;
		b = 3;
		
		String resultado = a==b ? "igual":"diferente";
		String resultadoMaior = a>b ? "maior":"menor";
	
		System.out.println(resultado);
		System.out.println(resultadoMaior);
		
		System.out.println("--------------------");
		
		
		boolean condicao1 = false;
		boolean condicao2 = false;
		
		if(condicao1&&condicao2) {
			System.out.println("são verdadeiras");
		}
		else if(!condicao1&&!condicao2) {
			System.out.println("sao falsas");
		}
		else if(condicao1||condicao2) {
			System.out.println("uma delas é verdadeira");
		}
		
	}

}
