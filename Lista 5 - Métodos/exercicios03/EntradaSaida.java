package exercicio03;

import java.util.Scanner;

public class EntradaSaida {
    static Scanner scanner = new Scanner(System.in);

    public static double receberSalario() {
        System.out.print("Informe seu salário atual: ");
        return scanner.nextDouble();
    }

    public static double receberValorEmprestimo() {
        System.out.print("Informe o valor que deseja emprestar: ");
        return scanner.nextDouble();
    }

    public static void mostrarResultado(double valorTotal, double valorParcela) {
        System.out.println("Valor total a ser pago: " + valorTotal);
        System.out.println("Valor de cada parcela: " + valorParcela);
    }
}
