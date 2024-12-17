package org.example;

public class Main {
    public static void main(String[] args) {
        Primo primo = nprimo -> {
            if (nprimo <= 1) return false;
            for (int i = 2; i <= Math.sqrt(nprimo); i++){
                if (nprimo % i == 0) return false;
            }
            return true;
        };
        System.out.println(primo.primo(11));
    }
}