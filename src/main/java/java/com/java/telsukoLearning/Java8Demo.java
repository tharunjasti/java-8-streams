package java.com.java.telsukoLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        List<Integer> values= Arrays.asList(1,2,3,4,5,6);

        /*for (int i: values){
            System.out.println(i);
        }*/
       // values.forEach(integer -> System.out.println(integer));
        List<Integer> numbers= Arrays.asList(1,2,1,3,3,2,4,8,5,6);
        numbers.stream()
                .filter(x -> x%2==0)
               //.limit(3)
                //.distinct()
                .skip(2)
                .collect(Collectors.toList())
                .forEach(i -> System.out.println(i) );

    }
}
