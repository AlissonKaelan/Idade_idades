/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idade;


import java.util.Calendar;

import java.util.Scanner;

/**
 *
 * @author Alisson Kaelan
 */
public class Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        //Ano do Sistema
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        System.out.println("Digite ano de nascimento");
        int nas = s.nextInt();
        
        
        boolean entradaValida = false;
        
        // Loop até que uma entrada válida seja fornecida
        while (!entradaValida) {
            System.out.println("Digite ano de nascimento  válido:");
            // Verifica se a entrada é um número
            if (s.hasNextInt()) {
                nas = s.nextInt();
                // Verifica se o ano de nascimento é válido
                if (nas > anoAtual) {
                    System.out.println("Ano de nascimento não pode ser maior que o ano atual (" + anoAtual + "). Tente novamente.");
                } else {
                    entradaValida = true; // Saia do loop se a entrada for válida
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                s.next(); // Limpa a entrada inválida
            }
        }
        
        int i = anoAtual - nas;
        
        if(i>=18){
            
            System.out.println("Voce tem " + i);
            System.out.println("Então é maior de idade.");
        } else{
            System.out.println("Você tem " + i + " anos.");
            System.out.println("Menor de idade");
        }
        s.close(); // Fecha o scanner
         
    }
    
}
