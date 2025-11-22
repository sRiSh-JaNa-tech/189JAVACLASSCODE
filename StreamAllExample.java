import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamAllExample {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(5,2,8,3,4,6);

        System.out.println(numbers);

        //filter()-keep only even no
        List<Integer> evens=numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(evens);

        //map()->square each no
        List<Integer> squares=numbers.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(squares);

        //sorted()-> sort ascending
        List<Integer> sorted=numbers.stream().sorted().collect(Collectors.toList());


        //distinct()->remove duplicates
        List<Integer> distint=numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(sorted);

        //count()->total no of ele
        long count=numbers.stream().count();
        System.out.println(count);

        //reduce()->sum of all no.
        //reduce(initial value,logic)
        int sum=numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum);

        //anymatch(),allMatch(),noneMatch()
        boolean anyeven=numbers.stream().anyMatch(n-> n%2==0);
        boolean allpositive=numbers.stream().allMatch(n-> n>0);
        boolean noneNegative=numbers.stream().noneMatch(n-> n<0);

        //linit() and skip()
        //if also want some filter use .filter along after sream
        List<Integer> linited=numbers.stream().limit(3).collect(Collectors.toList());
        List<Integer> skip=numbers.stream().skip(3).collect(Collectors.toList());


        //collect() to set
    }
}