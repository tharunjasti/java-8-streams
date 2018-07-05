package java.com.java.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamEx6 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");

        names.stream().filter(s -> s.startsWith("M"))
                        .forEach(s -> System.out.println(s));
    }
}
