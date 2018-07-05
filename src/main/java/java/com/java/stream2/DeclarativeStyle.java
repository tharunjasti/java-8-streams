package java.com.java.stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeclarativeStyle {
    public static void main(String[] args) {

        String doc1 = "<html><body>One of the most common uses of <i>streams</i> is to represent queries over data in collections</body></html>";
        String doc2 = "<html><body>Information integration systems provide valuable services to users by integrating information from a number of autonomous, heterogeneous and distributed Web sources</body></html>";
        String doc3 = "<html><body>Solr is the popular, blazing fast open source enterprise search platform from the Apache Lucene</body></html>";
        String doc4 = "<html><body>Java 8 goes one more step ahead and has developed a streams API which lets us think about parallelism</body></html>";

        List<String> documents=new ArrayList<>(Arrays.asList(doc1,doc2,doc3,doc4));

        System.out.println("Declarative style");

        documents.stream()
                .filter(s -> s.contains("stream"))
                .map( s -> s.toUpperCase())
                .forEach(s -> System.out.println(s) );
    }
}
