package Exercize.ex1.l2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner s = null;
        int sum = 0;
        List list = new ArrayList();
        List list1 = new ArrayList();

        list.add(0);

        try {
            while (list1.size() == 0) {
                s = new Scanner(new BufferedReader(new FileReader("D:\\AdventOfCode\\ex1.1.txt")));
                s.useLocale(Locale.US);

                while (s.hasNext()) {
                    if (s.hasNextInt()) {
                        sum += s.nextInt();

                        if (list.contains(sum)) {
                            list1.add(sum);
                            break;

                        }
                        list.add(sum);
                    } else {
                        s.next();
                    }
                }
            }
        } finally {
            s.close();
        }
        System.out.println(sum);
    }
}
