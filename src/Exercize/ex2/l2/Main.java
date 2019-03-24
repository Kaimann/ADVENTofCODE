package Exercize.ex2.l2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new BufferedReader(new FileReader("D:\\AdventOfCode\\ex2.1.txt")));
        Collection<char[]> all = new ArrayList<>();
        while (s.hasNextLine()) {
            String line = s.nextLine();
            char[] current = line.toCharArray();
            Optional<char[]> find = all.stream().filter((elem) -> {
                boolean miss = false;
                for (int i = 0; i < current.length; i++)
                    if (current[i] != elem[i])
                        if (miss) return false; else miss = true;
                return miss;
            }).findAny();
            if (find.isPresent()) {
                System.out.println(find.get());
                System.out.println(line);
            }
            all.add(current);
        }
    }

}
