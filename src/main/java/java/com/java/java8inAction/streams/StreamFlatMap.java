package java.com.java.java8inAction.streams;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<User> users= Arrays.asList(
                new User("Raj", 20, Arrays.asList("1", "2")),
                new User("vivek", 40, Arrays.asList("3", "4", "5")),
                new User("imran", 60, Arrays.asList("6")),
                new User("rakesh", 70, Arrays.asList("7", "8")),
                new User("mourya", 70, Arrays.asList("7", "8")),
                new User("kavya", 70, Arrays.asList("7", "8"))
        );

        Optional<String> add = users.stream()
                .map(user -> user.getAddress().stream())
                .flatMap(stringStream -> stringStream.filter(s -> s.equals("5")))
                .findAny();
        String s="";
        if (add.isPresent()){
             s= add.get();
        }
        System.out.println(s);


    }

    @Setter
    @Getter
    @ToString
    public static class User{
        private String name;
        private int age=30;
        private List<String > address;

        public User(String name, int age, List<String> address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public User(String name) {
            this.name = name;
        }
    }
}
