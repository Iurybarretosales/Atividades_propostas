package application;

import entities.FaturamentoEstados;

public class Main {
    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp + rj + mg + es + outros;

        System.out.printf("Percentual de representação por estado:\n");
        System.out.printf("SP: %.2f%%\n", FaturamentoEstados.calcularPercentual(sp, total));
        System.out.printf("RJ: %.2f%%\n", FaturamentoEstados.calcularPercentual(rj, total));
        System.out.printf("MG: %.2f%%\n", FaturamentoEstados.calcularPercentual(mg, total));
        System.out.printf("ES: %.2f%%\n", FaturamentoEstados.calcularPercentual(es, total));
        System.out.printf("Outros: %.2f%%\n", FaturamentoEstados.calcularPercentual(outros, total));
    }
}