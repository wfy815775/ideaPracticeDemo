import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*

并行流处理数据
无状态
不干预
关联性




 */
public class StreamDemo {
    public static void main(String[] args) {
            //
        List<Double> myList = new ArrayList<>(); //线程不安全

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        List<Double> myList1 = Collections.synchronizedList(new ArrayList<>());



//        Optional<Double> Roots =myList.stream().reduce((a,b)-> a * Math.sqrt(b));
//        System.out.println(Roots.get());
//        double Roots1 =myList.stream().reduce(1.0,(a,b)-> a * Math.sqrt(b));
//        System.out.println(Roots1);



//        LinkedList<Double> l1 =myList.parallelStream().map(n->n+1.0).
//               collect(() ->new LinkedList<Double>(),
//                        (list,element)-> {
//                 //  System.out.println("元素为"+element);
//                    list.add(element); } ,
//                        (la,lb)-> {
//                            System.out.println("哈哈");
//                   //第三个参数并发时才会用到
////                            System.out.println("la");
////                            la.stream().forEach(o-> System.out.print(o+" "));
////                            System.out.println("lb");
////                            lb.stream().forEach(o-> System.out.print(o+" "));
//                            la.addAll(lb);
//
//                });

//    Spliterator<Double> spliterator = myList1.spliterator();
//        while (spliterator.tryAdvance(System.out::println));

//
//Stream s= myList.parallelStream().map(n-> {myList1.add(n);
//    return n;} );
//        s.forEachOrdered(e -> System.out.print(e + " "));
//        System.out.println();
//        myList1
//                .stream()
//                .forEachOrdered(e -> System.out.print(e + " "));
//



        Stream<Double> s= myList.parallelStream().map(n -> n.doubleValue() );
        s.forEachOrdered(e -> System.out.print(e + " "));
        System.out.println();
        myList1
                .stream()
                .forEachOrdered(e -> System.out.print(e + " "));


    }
}
