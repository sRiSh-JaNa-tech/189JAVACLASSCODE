//package Unit2;

import java.util.*; //either do this
import java.util.function.Consumer;
//or do this (both has same work)
// @FunctionalInterface
// interface Consumer<T>{
//     void accept(T t); => abstract method that takes an object as input and do the implementation given in lambda expression
// }


class C_Emp{
    String name;
    int sal;
    C_Emp(String name, int sal){
        this.name=name;
        this.sal=sal;
    }
}
public class EmpConsumerEx {
    public static void main(String[] args) {
        //Creating an ArrayList that stores name and salary of employees

        ArrayList<C_Emp> employees=new ArrayList<>();
        employees.add(new C_Emp("Srish",50000));
        employees.add(new C_Emp("Jana",40000));

        //work 1 -> to increase bonus salary by 5000
        Consumer<C_Emp> giveBonus = (e) -> e.sal +=5000;
        //work 2 -> to print the names and salaries
        Consumer<C_Emp> show = (e) -> {
            System.out.println(e.name+" => "+e.sal);
        };

        employees.forEach(giveBonus);
        employees.forEach(show);
    }
}