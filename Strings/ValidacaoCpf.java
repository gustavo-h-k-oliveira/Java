package Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacaoCpf {    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o CPF:");
        String cpf = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}");
        Matcher matcher = pattern.matcher(cpf);

        if (matcher.matches()) {
            System.out.println("O CPF é válido.");
        } else {
            System.out.println("O código está inválido.");
        }

        scanner.close();
    }
}
