import java.util.Scanner;

public class Contador{
	public static void main(String[] args){

				try (Scanner scanner = new Scanner(System.in)) {
						System.out.println("Digite o valor do primeiro parâmetro: ");
						int parametroUm = scanner.nextInt();
						System.out.println("Digite o valor do segundo parâmetro: ");
						int parametroDois = scanner.nextInt();

				
 				try{ 
						contar(parametroUm, parametroDois);

				}catch (ParametrosInvalidosException e) {
					System.out.println("O segundo parâmetro deve ser maior que o primeiro");}
					}
			}
				static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
					if(parametroUm > parametroDois){
						throw new ParametrosInvalidosException();
					}
		
					int contagem = parametroDois - parametroUm;

					for(int x = 1; x <= parametroDois-parametroUm; x++) {
						System.out.println(" Imprimindo o número: " + x);
					}
		
			}
}