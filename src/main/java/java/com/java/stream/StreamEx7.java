package java.com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEx7 {
    public static void main(String[] args) {

        List<Student > studentlist=new ArrayList<>();
        studentlist.add(new Student(11,"Jon",22));
        studentlist.add(new Student(22,"Steve",18));
        studentlist.add(new Student(33,"Lucy",22));
        studentlist.add(new Student(44,"Sansa",23));
        studentlist.add(new Student(55,"Maggie",18));

        Set<Student> students=studentlist.stream()
                                .filter(s -> s.id >32 )
                                .collect(Collectors.toSet());
        students.forEach(student -> System.out.println(student));

        //getting average age
        Double avgAge = studentlist.stream().collect(Collectors.averagingInt(s -> s.age));
        System.out.println("Average Age of Students is: "+avgAge);
    }
}
