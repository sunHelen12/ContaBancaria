package entities;

import java.util.Scanner;

public class ContaBancaria {  
    
    Scanner sc =  new Scanner (System.in);
   
    private int numeroConta;
    private String name;
    private double valor;
    private Boolean answer = false;
    
    public ContaBancaria(int numeroConta, String name) {
        this.numeroConta = numeroConta;
        this.name = name;        
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValorInicial() {
        return valor;
    }

    public void  initialDeposit(char initial){        
        if (initial == 'y'){
            answer = true;
            System.out.print("Enter a initial deposit: ");
            valor = sc.nextDouble();
            
        } else if (initial == 'n'){
            answer = false;
        }      
    }

    public void addValue(double value){
        valor += value;
    }

    public void withdrawValue(double value){
        valor -= (value + 5.00);        
    }

    public String toString(){
        return  "Account: " 
        + Integer.toString(numeroConta)
        + ", Holder: "
        + name
        + ", Balance: $"
        + String.format("%.2f", valor);

    }



}   


