package application;

import utill.InverterString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe a string a ser invertida: ");
        String original = scanner.nextLine();

        String invertida = InverterString.inverterString(original);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}