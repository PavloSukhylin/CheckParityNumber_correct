package com.alevel.adv;

public class CheckParityNumber {
    public static void main(String[] args) {
        int number = 27;
        int remainder = number % 2;
        String conclusion = (remainder == 0) ? ("Число " + number + " четное") : ("Число " + number + " нечетное");
        System.out.println(conclusion);
    }
}
