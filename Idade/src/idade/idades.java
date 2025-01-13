/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Alisson Kaelan
 */
public class idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> datasDeNascimento = new ArrayList<>();
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);

        System.out.println("Digite 7 anos de nascimento (um por vez):");

        // Receber as 7 datas de nascimento
        for (int i = 0; i < 7; i++) {
            System.out.print("Ano de nascimento " + (i + 1) + ": ");
            int anoNascimento = scanner.nextInt();
            datasDeNascimento.add(anoNascimento);
        }

        // Contar maiores e menores de 18 anos
        int maiorDe18 = 0;
        int menorDe18 = 0;

        for (int ano : datasDeNascimento) {
            int idade = anoAtual - ano;
            if (idade >= 18) {
                maiorDe18++;
            } else {
                menorDe18++;
            }
        }

        // Exibir o resultado
        System.out.println("Quantidade de maiores de 18 anos: " + maiorDe18);
        System.out.println("Quantidade de menores de 18 anos: " + menorDe18);

        scanner.close();

    }
}
