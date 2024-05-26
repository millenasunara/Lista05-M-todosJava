package exercicio03;

public class Calculo {
    public static double calcularValorTotalEmprestimo(double valorEmprestimo) {
        return valorEmprestimo * 1.35;
    }

    public static double calcularValorParcela(double valorTotal) {
        return valorTotal / 24;
    }
}
