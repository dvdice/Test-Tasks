package org.example;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        StringBuilder str = new StringBuilder();
        int i = 1;

        do {
            str.append(i);
            i = (i + m - 2) % n + 1;
        }while (i != 1);

        System.out.println(str);
    }
}