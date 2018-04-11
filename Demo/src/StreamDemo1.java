import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.xpath.internal.SourceTree;
import sun.awt.HeadlessToolkit;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
//        List<Person> persons = new ArrayList<>();
//        for (int i = 100; i > 0; i--) {
//            Person person = new Person(i,"name"+i);
//            persons.add(person);
//        }
//        List<String> persons2 = persons.stream().map(Person::getName).limit(10).skip(3).sorted()
//                .collect(Collectors.toList());
//        boolean isAllAdult = persons.stream().anyMatch(p->p.no==95);
//        System.out.println(isAllAdult);
//        System.out.println(persons2);


//        Random seed = new Random();
//        Supplier<Integer> random = seed::nextInt;
//        Stream.generate(new PersonSupplier()).limit(10).forEach(System.out::println);
//        Stream.iterate(2,n->n*n).limit(10).forEach(System.out::println);
//        Map<Boolean, List<Person>> children = Stream.generate(new PersonSupplier()).
//                limit(100).collect(Collectors.partitioningBy(p->p.no<18));
        Map<Integer, List<Person>> personGroups = Stream.generate(new PersonSupplier()).
                limit(100).collect(Collectors.groupingBy(Person::getAge));
        Iterator it = personGroups.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer, List<Person>> persons = (Map.Entry)it.next();
            System.out.println("Age " + persons.getKey() + " = " + persons.getValue().size());
        }
//        System.out.println("Children number: " + children.get(true).size());
//        System.out.println("Adult number: " + children.get(false).size());

    }


}

class PersonSupplier implements Supplier<Person> {
    private int index = 0;
    private Random random = new Random();

    @Override
    public Person get() {
        return new Person(index++, "StormTestUser" + random.nextInt(100));
    }
}

class Person {
    public int no;
    private String name;

    public Person(int no, String name) {
        this.no = no;
        this.name = name;
    }
    public int getAge(){
        return no;
}
    public String getName() {
        System.out.println(name);
        return name;
    }
}
