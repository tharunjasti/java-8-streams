package java.com.java.stream;

import java.util.HashMap;
import java.util.Map;

public class StreamEx5 {
    public static void main(String[] args) {
        Map<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Monkey");
        hmap.put(2, "Dog");
        hmap.put(3, "Cat");
        hmap.put(4, "Lion");
        hmap.put(5, "Tiger");
        hmap.put(6, "Bear");

        hmap.forEach((key, value) -> System.out.println(key+" "+value));

        hmap.forEach( (key, value) -> {
            if (key == 4){
                System.out.println("Value associated with key 4 is: "+value);
            }
        });

    }
}
