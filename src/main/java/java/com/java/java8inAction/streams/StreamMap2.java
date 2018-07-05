package java.com.java.java8inAction.streams;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

public class StreamMap2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Peter", "Sam", "Greg", "Ryan");
        names.stream()
                .filter(s -> !s.equals("Sam"))
                .map(s -> new User(s))
                .forEach(x -> System.out.println(x));


    }

    @Setter
    @Getter
    @ToString
    public static class User{
        private String name;
        private int age=30;

        public User(String name) {
            this.name = name;
        }
    }
}
