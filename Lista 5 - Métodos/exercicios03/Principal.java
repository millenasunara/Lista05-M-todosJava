package exercicio03;

public class Principal {
    public static void main(String[] args) {
        double salarioAtual = EntradaSaida.receberSalario();
        double valorEmprestimo = EntradaSaida.receberValorEmprestimo();

        if (Validacao.validarEmprestimo(salarioAtual, valorEmprestimo)) {
            double valorTotal = Calculo.calcularValorTotalEmprestimo(valorEmprestimo);
            double valorParcela = Calculo.calcularValorParcela(valorTotal);
            EntradaSaida.mostrarResultado(valorTotal, valorParcela);
        } else {
            System.out.println("Empréstimo não pode ser realizado. Valor da parcela excede 15% do salário.");
        }
    }
}
