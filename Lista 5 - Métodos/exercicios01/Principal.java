package exercicio01;

public class Principal {
    public static void main(String[] args) {
        double[] notas = EntradaSaida.receberNotas();
        double media;
        
        if (EntradaSaida.receberTipoMedia().equalsIgnoreCase("Aritmetica")) {
            media = Calculo.calcularMediaAritmetica(notas);
        } else {
            double[] pesos = EntradaSaida.receberPesos();
            media = Calculo.calcularMediaPonderada(notas, pesos);
        }
        
        Resultado.mostrarResultado(media);
    }
}
