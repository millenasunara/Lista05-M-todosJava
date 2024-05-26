package exercicio03;

public class Validacao {
    public static boolean validarEmprestimo(double salario, double valorEmprestimo) {
        double valorParcela = Calculo.calcularValorParcela(Calculo.calcularValorTotalEmprestimo(valorEmprestimo));
        return valorEmprestimo <= 200000 && valorParcela <= (salario * 0.15);
    }
}
