package java.com.java.java8inAction.streams;

import com.java.java8inAction.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {
    public static void main(String[] args) {

        Dish.menu.stream()
                .filter(dish -> dish.getCalories()>300)
                .map(dish -> dish.getName())
              //  .limit(3)
                .collect(Collectors.toList());
               // .forEach(s -> System.out.println(s));

        getLowCaloriesFood(300).forEach(System.out::println);
        System.out.println("****************************");
        Dish.menu.stream()
                .filter(dish -> dish.isVegetarian())
                .forEach(dish -> System.out.println(dish.getName()));

        List<String> meatTypes = Dish.menu.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .map(dish -> dish.getName())
                .collect(Collectors.toList());
        System.out.println(meatTypes);


    }

    public static List<String> getLowCaloriesFood(int i){
        List<String> names = Dish.menu.stream()
                .filter(d -> d.getCalories() > i)
                .map(d -> d.getName())
                .collect(Collectors.toList());
        return names;
    }
}
