package java.com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String > longNames=names.stream()                      //converting list to stream
                                    .filter(s -> s.length() >6)     //filter the stream to create a new steam
                                    .collect(Collectors.toList());  //collect the final stream and convert it into a list

        longNames.forEach(System.out::println);

    }
}
