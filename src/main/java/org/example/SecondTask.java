package org.example;

import java.io.*;
import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        float x0, y0, x, y, r;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first input-file name");
        String input1 = scanner.nextLine();
        System.out.println("Enter second input-file name");
        String input2 = scanner.nextLine();

        try(BufferedReader reader1 = new BufferedReader(new FileReader(input1));)
        {
            BufferedReader reader2 = new BufferedReader(new FileReader(input2));
            String line = reader1.readLine();
            x0 = line.charAt(0) - 48;
            y0 = line.charAt(2) - 48;
            r = reader1.readLine().charAt(0) - 48;

            line = reader2.readLine();
            while (line != null){
                x = line.charAt(0) - 48;
                y = line.charAt(2) - 48;
                float round = (float) (Math.pow(x - x0, 2) + Math.pow(y - y0, 2));
                if (round < (Math.pow(r,2))){
                    System.out.println(1);
                } else if (round == (Math.pow(r,2))) {
                    System.out.println(0);
                } else if (round > (Math.pow(r,2))) {
                    System.out.println(2);
                }
                line = reader2.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
