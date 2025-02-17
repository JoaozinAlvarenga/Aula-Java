package com.mycompany.aula14022025;

import java.util.Scanner;

public class Aula14022025 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int opcao = -1;
        
        while(opcao != 0){
            
            System.out.println("\t=========================");
            System.out.println("\t\tMENU");
            System.out.println("\t=========================");
            System.out.println("\t(1) soma (+)");
            System.out.println("\t(2) subtração (-)");
            System.out.println("\t(3) multiplicação (*)");
            System.out.println("\t(4) divisão (/)");
            System.out.println("\t(0) sair");
            System.out.println("\t=========================");
            System.out.print("\tDigite a opção desejada: ");
            
            opcao = scan.nextInt();
        
            switch(opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Adição");
                    break;
                case 2:
                    System.out.println("Subtração");
                    break;
                case 3:
                    System.out.println("Multiplicação");
                    break;
                case 4:
                    System.out.println("Divisão");
                    break;
                default:
                    System.out.println("Opção errada: Digite um número entre 0 e 4.");
                    break;
            }

            System.out.printf("A opção selecionada foi: %d \n", opcao);
        }

        scan.close();
    }
}
