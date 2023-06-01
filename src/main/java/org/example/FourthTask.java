package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter input-file name");
        String input1 = scanner.nextLine();
        ArrayList<Integer> nums = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(input1));)
        {
            String line = reader.readLine();
            while (line != null){
                nums.add(Integer.parseInt(line));
                line = reader.readLine();
            }
            Collections.sort(nums);
            int middle = nums.size() / 2;
            int medianValue = nums.get(middle);
            if (nums.size() % 2 == 0) {
                medianValue = (medianValue + nums.get(middle - 1)) / 2;
            }

            int cnt = 0;
            for (int i : nums) {
                while (i != medianValue){
                    if (i < medianValue){
                        i += 1;
                    } else if (i > medianValue) {
                        i -= 1;
                    }
                    cnt++;
                }
            }
            System.out.println(cnt);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
