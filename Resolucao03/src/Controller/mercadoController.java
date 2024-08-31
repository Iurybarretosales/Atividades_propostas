package Controller;

public class mercadoController {

    public static double menorFaturamento(double[] faturamento) {
        double menor = Double.MAX_VALUE;

        for (double valor : faturamento) {
            if (valor > 0 && valor < menor) {
                menor = valor;
            }
        }

        return menor;
    }

    public static double maiorFaturamento(double[] faturamento) {
        double maior = Double.MIN_VALUE;

        for (double valor : faturamento) {
            if (valor > maior) {
                maior = valor;
            }
        }

        return maior;
    }

    public static int diasAcimaDaMedia(double[] faturamento) {
        double soma = 0;
        int diasComFaturamento = 0;

        // Calcular a soma dos faturamentos e o número de dias com faturamento
        for (double valor : faturamento) {
            if (valor > 0) {
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        // Contar os dias com faturamento acima da média
        for (double valor : faturamento) {
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        return diasAcimaDaMedia;
    }

}
