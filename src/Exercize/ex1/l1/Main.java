package Exercize.ex1.l1;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner s = null;
        int sum = 0;

        try {
            s = new Scanner(new BufferedReader(new FileReader("D:\\AdventOfCode\\ex1.1.txt")));
            s.useLocale(Locale.US);


            while (s.hasNext()) {
                if (s.hasNextInt()) {
                    sum += s.nextInt();
                } else {
                    s.next();

                }
            }
        } finally {
            s.close();
        }

        System.out.println(sum);
    }
}
