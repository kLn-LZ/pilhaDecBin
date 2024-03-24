package View;

import Controller.ConverteController;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        ConverteController cC = new ConverteController();
        Scanner scan = new Scanner(System.in);

        System.out.print("Insira um número, menor ou igual a mil, a ser convertido para binario: ");
        int dec = scan.nextInt();

        while (dec > 1000) {
            System.out.println("\nValor inválido");
            System.out.print("Insira um número, menor ou igual a mil, a ser convertido para binario: ");
            dec = scan.nextInt();
        }

        System.out.println(cC.decToBin(dec));


    }
}

