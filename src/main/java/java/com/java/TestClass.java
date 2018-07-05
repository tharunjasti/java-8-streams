package java.com.java;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");

        long count = names.stream().filter(s -> s.length() < 9).count();
        System.out.println(count);
    }
}
