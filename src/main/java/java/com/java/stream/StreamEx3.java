package java.com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Melisandre","Sansa","Jon","Daenerys","Joffery");

        List<String> longNames=names.stream()
                                .filter(s -> s.length() > 6 && s.length() <8)
                                .collect(Collectors.toList());
        longNames.forEach(s -> System.out.println(s));

    }
}
