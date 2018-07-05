package java.com.java.telsukoLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx1 {
    public static void main(String[] args) {

        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7);

        /*int sum=0;
        for(int x:values){
            sum=sum+x;
        }
        System.out.println(sum);*/
        List<Integer> num = values.stream()
                                    .map(i -> i * 2)
                                    .collect(Collectors.toList());
        num.forEach(x -> System.out.println(x));


    }
}
