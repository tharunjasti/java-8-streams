package java.com.java.java8inAction.streams;

import com.java.java8inAction.Dish;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static List<Dish> menu = Dish.menu;
    public static void main(String[] args) {

        menu.stream()
                .map(dish -> dish.getName())
                .map(s ->{
                    System.out.print(s+"::"); return  s.length();})
                .forEach(integer -> System.out.print(integer+"\n"));
        List<String > words= Arrays.asList("Java8", "Lambdas", "In", "Action");

      // words.stream().map(word -> word.length()).forEach(System.out::println);
        // System.out.println(listOfWords.size());

        words.stream().map(w -> w.split("")).collect(Collectors.toSet()).forEach(System.out::println);


    }


}

