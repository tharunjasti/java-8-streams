package java.com.java.java8inAction.streams;

import com.java.java8inAction.Dish;

import java.util.List;
import java.util.stream.Collectors;

public class Filtering {

   public static List<Dish> menu = Dish.menu;

    public static void main(String[] args) {
        //filtering a stream
        List<Dish> veg=menu.stream().filter(d ->d.isVegetarian()).collect(Collectors.toList());
        veg.forEach(dish -> System.out.println(dish.getName()));



    }
    public static void filteringStream(){

    }
}
