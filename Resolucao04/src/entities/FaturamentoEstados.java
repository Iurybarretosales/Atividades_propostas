package entities;

public class FaturamentoEstados {

    public static double calcularPercentual(double valorEstado, double valorTotal) {
        return (valorEstado / valorTotal) * 100;
    }

}
