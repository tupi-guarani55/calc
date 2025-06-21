import java.util.Scanner;

public class calculadoraMEM {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        double num1, num2, resultado;
	        char operador;
	        String continuar;

	        System.out.println("=== CALCULADORA SIMPLES ===");

	        while (true) {
	            System.out.print("\nDigite o primeiro número: ");
	            num1 = input.nextDouble();

	            System.out.print("Digite o operador (+, -, *, /): ");
	            operador = input.next().charAt(0);

	            System.out.print("Digite o segundo número: ");
	            num2 = input.nextDouble();

	            switch (operador) {
	                case '+':
	                    resultado = num1 + num2;
	                    System.out.println("Resultado: " + resultado);
	                    break;
	                case '-':
	                    resultado = num1 - num2;
	                    System.out.println("Resultado: " + resultado);
	                    break;
	                case '*':
	                    resultado = num1 * num2;
	                    System.out.println("Resultado: " + resultado);
	                    break;
	                case '/':
	                    if (num2 != 0) {
	                        resultado = num1 / num2;
	                        System.out.println("Resultado: " + resultado);
	                    } else {
	                        System.out.println("Erro: Divisão por zero não é permitida.");
	                    }
	                    break;
	                default:
	                    System.out.println("Operador inválido.");
	            }

	            System.out.print("\nDeseja fazer outra operação? (s para sim / n para não): ");
	            continuar = input.next();

	            if (continuar.equalsIgnoreCase("n")) {
	                System.out.println("Encerrando a calculadora. Até logo!");
	                break;
	            }
	        }

	        input.close();

		}
}
