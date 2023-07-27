package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomTest {

    public static void main(String[] args) {
        List<Integer> execute = execute(100, 10);
        System.out.println(execute.toString());
        System.out.println(execute.stream().collect(Collectors.summingInt(e -> e)));
    }

    public static List<Integer> execute(Integer n, Integer x) {
        n = n * 10;
        List<Integer> result = new ArrayList<Integer>();
        for (int j = 0 ; j < x ; j++) {
            Random r = new Random();
            Integer maxR = n - (x - j) * 1;
            Integer b = ((maxR.equals(0)) ? (0) : (r.nextInt(maxR))) + 1;
            result.add(b);
            n -= b;
        }
        return result;
    }
}
