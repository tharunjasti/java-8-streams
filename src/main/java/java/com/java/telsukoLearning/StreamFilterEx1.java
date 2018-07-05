package java.com.java.telsukoLearning;

import java.util.Arrays;
import java.util.List;

public class StreamFilterEx1 {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(12,32,30,15,20,50,44,75);
        Integer num = values.stream()
                .filter(i -> i % 5 == 0)
                .reduce(0, (c, e) -> c + e);
        System.out.println(num);
        values.stream()
                .filter(i -> i % 5 == 0)
                .map(x -> x*2)
                .forEach(x -> System.out.println(x));

        System.out.println(values.stream()
                .filter(i -> i % 19 == 0)
                .map(x -> x*2)
                .findAny().orElse(0));
    }
}
