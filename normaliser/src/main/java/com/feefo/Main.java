package com.feefo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Normaliser normaliser = new Normaliser();
        System.out.println(normaliser.normalise("Python engineer"));
        System.out.println(normaliser.normalise("Chief Accountant"));
        System.out.println(normaliser.normalise("Accountant"));
        System.out.println(normaliser.normalise("Solutions Architect"));

    }
}