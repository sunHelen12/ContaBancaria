package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        ContaBancaria conta;

        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit(y/n)? ");
        char initial = sc.next().charAt(0);
        conta = new ContaBancaria(numeroConta, name);
        
        conta.initialDeposit(initial);
        System.out.println("Account data: ");
        System.out.println(conta);

        System.out.print("Enter a deposit value: ");
        double value = sc.nextDouble();  
        conta.addValue(value);      
        System.out.println("Update data: ");
        System.out.println(conta);

        System.out.print("Enter a withdraw: ");
        value = sc.nextDouble();
        conta.withdrawValue(value);
        System.out.println("Update data: ");
        System.out.println(conta);  

        sc.close();
    }
}
