package userinterface;

import services.CurrencyConverter;
import services.HistoryService;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
    private final Scanner input = new Scanner(System.in);
    private final CurrencyConverter converter = new CurrencyConverter();
    private final HistoryService history = new HistoryService();

    public void start() {
        int option = 0;

        while (option != 7) {
            welcome();
            showMenu();

            System.out.print("Escolha uma opção válida: ");
            option = input.nextInt();

            handleOption(option);
        }

        System.out.println("Programa encerrado. Até mais!");
    }

    private void showMenu() {
        System.out.println();
        System.out.println("1 - Dólar\t\t\t=>>\tReal Brasileiro");
        System.out.println("2 - Real Brasileiro\t=>>\tDólar");
        System.out.println("3 - Euro\t\t\t=>>\tReal Brasileiro");
        System.out.println("4 - Real Brasileiro\t=>>\tEuro");
        System.out.println("5 - Peso Argentino\t=>>\tReal Brasileiro");
        System.out.println("6 - Real Brasileiro\t=>>\tPeso Argentino");
        System.out.println("7 - Sair");
        System.out.println();
        System.out.println("=".repeat(50));
    }

    public void welcome() {
        System.out.println("=".repeat(50));
        System.out.println("Bem-vindo(a) ao Conversor de Moedas");
        System.out.println("=".repeat(50));
    }

    private void handleOption(int option) {
        switch (option) {

            case 1 -> convert("USD", "BRL");
            case 2 -> convert("BRL", "USD");
            case 3 -> convert("EUR", "BRL");
            case 4 -> convert("BRL", "EUR");
            case 5 -> convert("ARS", "BRL");
            case 6 -> convert("BRL", "ARS");
            case 7 -> { }
            default -> System.out.println("Opção inválida, tente novamente!");
        }

        System.out.println("\nPressione ENTER para continuar...");
        input.nextLine();
        input.nextLine();

        clearScreen();
    }

    private void convert(String from, String to) {

        try {
            System.out.print("Digite o valor em " + from + ": ");
            double amount = input.nextDouble();

            double result = converter.convert(from, to, amount);

            System.out.printf("%.2f %s = %.2f %s\n",  amount, from, result, to);

            String record = amount + " " + from + " → " + result + " " + to;

            history.save(record);
        } catch (InputMismatchException e) {
            System.out.println("Erro: valor inválido. Use vírgula para decimais.");
        }
    }

    private void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
