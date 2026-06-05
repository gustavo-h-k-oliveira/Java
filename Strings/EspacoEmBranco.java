package Strings;

import java.util.Scanner;

public class EspacoEmBranco {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        String nomeFormatado = nome.trim()
            .toUpperCase();
        System.out.println("Nome sem espaços: " + nomeFormatado);
        scanner.close();
    }
}
