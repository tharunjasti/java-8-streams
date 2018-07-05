package java.com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {

        List<String > names= Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        //creating the steam of all names
        Stream<String> allNames = names.stream();

        Stream<String> longNames = allNames.filter(s -> s.length() > 6);
        longNames.forEach(s -> System.out.println(s));

    }
}
