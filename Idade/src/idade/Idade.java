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
        int i = anoAtual - nas;
        if(i>=18){
            
            System.out.println("Voce tem " + i);
            System.out.println("Entao e maior de idade");
        } else{
            System.out.println("Voce tem " + i);
            System.out.println("Menor de idade");
        }
        
         
    }
    
}
