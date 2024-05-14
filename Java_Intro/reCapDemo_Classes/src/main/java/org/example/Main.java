package org.example;

public class Main {
    public static void main(String[] args) {
        FourTransaction fourTransaction = new FourTransaction();

        int addition = fourTransaction.Addition(3, 4);
        int subtraction = fourTransaction.Subtraction(12, 6);
        int multiplication = fourTransaction.Multiplication(9, 7);
        int division = fourTransaction.Division(60, 20);
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);

        System.out.println("Addition : " + addition +"\n"+ "Subtraction : " + subtraction +"\n"+ "Multiplication : " + multiplication +"\n"+ "Division : " + division);
    }
}