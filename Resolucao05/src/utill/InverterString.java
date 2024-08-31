package utill;

public class InverterString {

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int tamanho = caracteres.length;
        char[] invertida = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            invertida[i] = caracteres[tamanho - 1 - i];
        }

        return new String(invertida);
    }
}
