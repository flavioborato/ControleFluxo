import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws ParametrosInvalidosException {

		try {
			//chamando o método contendo a lógica de contagem
			Scanner terminal = new Scanner(System.in);
			System.out.println("Digite o primeiro parâmetro");
			Integer parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			Integer parametroDois = terminal.nextInt();
			contar(parametroUm, parametroDois);
		}catch (InputMismatchException exception) {
			System.out.println("Digite um numero Inteiro para ser valido!!!");
		}	
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		try {
			conferirOrdem(parametroUm, parametroDois);
			Integer contagem = parametroDois - parametroUm;
			if(contagem > 0) {
				for (int i = 0; i < contagem; i++) {
					System.out.println("Imprimindo o número"+ (i+1));
				}
			}else{
				System.out.println("Sem impressão, numeros iguais");
			}
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O primeiro numero é maior que o segundo, impossibilita contagem!!!");
			System.out.println("Por Favor, digite novamente da forma correta!!!");
		}
		

		
		System.out.println("");
		System.out.println("Fim!!!");
	}

	static void conferirOrdem(Integer num1, Integer num2) throws ParametrosInvalidosException{
		if(num1 > num2) {
			throw new ParametrosInvalidosException();
		}
		
	}

}
