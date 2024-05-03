import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;

        do {
            System.out.println("Selecione a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("Q - Sair");

            opcao = scanner.next().charAt(0);

            if (opcao == 'Q' || opcao == 'q') {
                System.out.println("Encerrando a calculadora.");
                break;
            }

            double resultado;
            switch (opcao) {
                case '1':
                    resultado = adicao();
                    System.out.println("Resultado: " + resultado);
                    break;
                case '2':
                    resultado = subtracao();
                    System.out.println("Resultado: " + resultado);
                    break;
                case '3':
                    resultado = multiplicacao();
                    System.out.println("Resultado: " + resultado);
                    break;
                case '4':
                    resultado = divisao();
                    if (Double.isNaN(resultado)) {
                        System.out.println("Impossível realizar uma divisão por zero.");
                    } else {
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                case '5':
                    resultado = potencia();
                    System.out.println("Resultado: " + resultado);
                    break;
                case '6':
                    resultado = raizQuadrada();
                    if (Double.isNaN(resultado)) {
                        System.out.println("Não existe raiz de número negativo.");
                    } else {
                        System.out.println("Resultado: " + resultado);
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println(); // Adiciona uma linha em branco para melhorar a legibilidade
        } while (true);

        scanner.close();
    }

    private static double adicao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();
        return numeroUm + numeroDois;
    }

    private static double subtracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();
        return numeroUm - numeroDois;
    }

    private static double multiplicacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();
        return numeroUm * numeroDois;
    }

    private static double divisao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numeroDois = scanner.nextDouble();
        if (numeroDois == 0) {
            return Double.NaN; // Not a Number
        }
        return numeroUm / numeroDois;
    }

    private static double potencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numeroUm = scanner.nextDouble();
        System.out.print("Digite o segundo número (expoente): ");
        double numeroDois = scanner.nextDouble();
        return Math.pow(numeroUm, numeroDois);
    }

    private static double raizQuadrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número para calcular a raiz quadrada: ");
        double numero = scanner.nextDouble();
        if (numero < 0) {
            return Double.NaN; // Not a Number
        }
        return Math.sqrt(numero);
    }
}


