import jdk.nashorn.internal.ir.IfNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
//        Stream stream = Stream.of("a","b","c");
//        String[] array = new String[]{"a","b","c"};
//        stream = Stream.of(array);
//        stream = Arrays.stream(array);
//        List<String> list = Arrays.asList(array);
//        stream = list.stream();
//
//        IntStream intStream = IntStream.of(new int[]{1,2,3});
//        intStream.forEach(a-> System.out.println(a));
//        IntStream.range(1,6).forEach(System.out::print);
//        System.out.println();
//        IntStream.rangeClosed(1,6).forEach(System.out::print);
//        System.out.println();
//        String[] a = (String[]) stream.toArray(String[]::new);
//        for (String s : a) {
//            System.out.println(s);
//        }
        //  List<String> list1 = (List<String>) stream.collect(Collectors.toList());
        // list1.stream().forEach(System.out::println);
        // String str =(String) stream.collect(Collectors.joining()).toString();
        // System.out.println(str);

//          LinkedList<String> list2 = (LinkedList<String>) stream.collect(Collectors.toCollection(LinkedList::new));
//          LinkedList<String> list3 = list2.stream().map(String::toUpperCase).collect(Collectors.toCollection(LinkedList::new));
//          list3.forEach(System.out::print);
//          List<Integer> list4 = Arrays.asList(new Integer(1),new Integer(2),new Integer(3));
//          list4.stream().map(n->n*n).forEach(System.out::print);
//        System.out.println();
//        System.out.println(StreamDemo.getLength("wangfuyao"));


        String contact = Stream.of("a","B","c","D","e","F").filter(x->x.compareTo("Z")>0)
                .reduce("",String::concat);
        System.out.println(contact);


    }

    public static int getLength(String text){
        return Optional.ofNullable(text).map(String::length).orElse(-1);
    }
}
