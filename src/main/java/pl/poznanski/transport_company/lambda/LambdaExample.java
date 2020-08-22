package pl.poznanski.transport_company.lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class LambdaExample {
    //INTERFEJSY FUNKCYJNE
    //Są niezbędne do użycia wyrażeń Lambda!
    public static void main(String[] args) {

        //Function<T, R> zawiera metodę apply, która przyjmuje instancję klasy T zwracając instancję klasy R
        Function<Integer, Long> function = y -> 123L;
        System.out.println(function.apply(123));

        //UnaryOperator<T> jest specyficznym przypadkiem interfejsu Function. W tym przypadku typ argumentu i typ zwracany są te same.
        UnaryOperator<String>unaryOperator= s -> s+"--";
        System.out.println(unaryOperator.apply("napis"));

        //Consumer<T> zawiera metodę accept, która przyjmuje instancję klasy T
        Consumer<Integer>consumer = g->{};
        consumer.accept(10);

        //Predicate<T> zawiera metodę test, która przyjmuje instancję klasy T i zwraca flagę. Interfejs ten może posłużyć do zastąpienia interfejsu Checker
        Predicate<Integer>predicate = b ->b.equals(10);
        System.out.println(predicate.test(10));

        //Supplier<T> zawiera metodę get, która nie przyjmuje żadnych parametrów i zwraca instancję klasy T
        int x = 5 ;
        Supplier<Integer> supplier = () -> x * x;
        System.out.println(supplier.get());
    }
}
