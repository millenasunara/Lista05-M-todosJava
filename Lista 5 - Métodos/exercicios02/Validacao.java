package exercicio02;

public class Validacao {
    public static boolean validarSalario(double salario) {
        if (salario >= 500 && salario <= 30000) {
            return true;
        } else {
            System.out.println("Salário inválido! Informe um valor entre 500 e 30000.");
            return false;
        }
    }
}