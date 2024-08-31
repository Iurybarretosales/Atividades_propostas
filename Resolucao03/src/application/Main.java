package application;


import static Controller.mercadoController.*;

public class Main {
    public static void main(String[] args) {
        double[] faturamentoDiario = {
                1500.50, 2300.00, 1800.75, 0.0, 5600.20, 1200.00, 0.0, 3100.50,
                2500.75, 4800.60, 0.0, 3300.30, 2750.20, 4100.10, 3050.75, 2000.40,
                3200.00, 1400.20, 0.0, 4900.60, 5100.80, 3700.25, 4200.30, 6000.75,
                1000.90, 0.0, 2300.10, 0.0, 5400.20, 3200.60
        };

        System.out.println("Menor valor de faturamento: R$ " + menorFaturamento(faturamentoDiario));
        System.out.println("Maior valor de faturamento: R$ " + maiorFaturamento(faturamentoDiario));
        System.out.println("Número de dias com faturamento superior à média: " + diasAcimaDaMedia(faturamentoDiario));
    }
}