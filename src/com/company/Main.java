package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner kbReadingString = new Scanner(System.in);
        Scanner kbReadingInt = new Scanner(System.in);


        System.out.println("Type in a word.");

        String sign = kbReadingString.next();
        System.out.println("Type in another word.");
        int word1 = kbReadingInt.nextInt();
        int word2 = kbReadingInt.nextInt();

        int n1 = word1.length;
        int n2 = word2.length;

    }
}
