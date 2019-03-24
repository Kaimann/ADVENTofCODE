package Exercize.ex2.l1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static int two = 0;
    public static int three = 0;

    public static void main(String[] args) throws FileNotFoundException {

        Scanner s = null;
        List<String> list = new ArrayList<String>();
        List<Character> list1 = new ArrayList<Character>();

        try {
            s = new Scanner(new BufferedReader(new FileReader("D:\\AdventOfCode\\ex2.1.txt")));
            s.useLocale(Locale.US);


            while (s.hasNext()) {
                if (s.hasNextLine()) {
                    list.add(s.nextLine());
                } else {
                    s.next();

                }
            }
        } finally {
            s.close();
        }

        for (String stroka : list) {
            StringBuilder sb = new StringBuilder(stroka);

            int[] counter = new int[26];

            int t2 = 0;
            int t3 = 0;

            for (int i = 0; i < sb.length(); i++) {

                char symvol = sb.charAt(i);

                list1.add(symvol);

                switch (symvol) {
                    case 'a':
                        counter[0]++;
                        break;
                    case 'b':
                        counter[1]++;
                        break;
                    case 'c':
                        counter[2]++;
                        break;
                    case 'd':
                        counter[3]++;
                        break;
                    case 'e':
                        counter[4]++;
                        break;
                    case 'f':
                        counter[5]++;
                        break;
                    case 'g':
                        counter[6]++;
                        break;
                    case 'h':
                        counter[7]++;
                        break;
                    case 'i':
                        counter[8]++;
                        break;
                    case 'j':
                        counter[9]++;
                        break;
                    case 'k':
                        counter[10]++;
                        break;
                    case 'l':
                        counter[11]++;
                        break;
                    case 'm':
                        counter[12]++;
                        break;
                    case 'n':
                        counter[13]++;
                        break;
                    case 'o':
                        counter[14]++;
                        break;
                    case 'p':
                        counter[15]++;
                        break;
                    case 'q':
                        counter[16]++;
                        break;
                    case 'r':
                        counter[17]++;
                        break;
                    case 's':
                        counter[18]++;
                        break;
                    case 't':
                        counter[19]++;
                        break;
                    case 'u':
                        counter[20]++;
                        break;
                    case 'v':
                        counter[21]++;
                        break;
                    case 'w':
                        counter[22]++;
                        break;
                    case 'x':
                        counter[23]++;
                        break;
                    case 'y':
                        counter[24]++;
                        break;
                    case 'z':
                        counter[25]++;
                        break;
                    default:
                        break;
                }
            }
            for (int j = 0; j < counter.length; j++) {
                if (counter[j] == 2) {
                    t2 = 2;
                }
                if (counter[j] == 3) {
                    t3 = 3;
                }
            }
            if (t2 == 2) {
                two++;
            }
            if (t3 == 3) {
                three++;
            }
        }
        System.out.println("Это число : " + two * three);
    }
}
/*
Или вот так:

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

    public class Main {

        public static void main (String[] args) throws FileNotFoundException {
            Scanner s = new Scanner(new BufferedReader(new FileReader("D:\\AdventOfCode\\ex2.1.txt")));
            int count2 = 0, count3 = 0;
            while (s.hasNextLine()) {
                boolean check2 = true, check3 = true;
                for (int value : s.nextLine().chars().collect(HashMap<Integer, Integer>::new, (map, elem) -> map.put(elem, map.getOrDefault(elem, 0) + 1), HashMap::putAll).values())
                    if (check2 && value == 2) {
                        count2++;
                        if (!check3) break;
                        check2 = false;
                    }
                    else if (check3 && value == 3) {
                        count3++;
                        if (!check2) break;
                        check3 = false;
                    }
            }
            System.out.println(count2 * count3);
        }

    }
 */