package pl.poznanski.transport_company.lambda;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.*;
//Dla uproszczenia można powiedzieć, że wyrażenie lambda jest metodą1. Metodą, którą możesz przypisać do zmiennej.
// Możesz ją także wywołać czy przekazać jako argument do innej metody.
//
//Wyrażenia lambda możesz także porównać do klas anonimowych2. Mają one jednak dużo bardziej czytelną i zwięzłą składnię.
public class LambdaExample {
    //INTERFEJSY FUNKCYJNE - to takie ktore zawieraja dokladnie 1 metode abstrakcyjna
    //Są niezbędne do użycia wyrażeń Lambda!
    public static void main(String[] args) {

        //Function<T, R> zawiera metodę apply, która przyjmuje instancję klasy T zwracając instancję klasy R(do konstruktorow czesto)
        Function<Integer, Long> function = y -> 123L;
        System.out.println(function.apply(123));

        //UnaryOperator<T> jest specyficznym przypadkiem interfejsu Function. W tym przypadku typ argumentu i typ zwracany są te same.
        UnaryOperator<String>unaryOperator= s -> s+"--";
        System.out.println(unaryOperator.apply("napis"));

        //Consumer<T> zawiera metodę accept, która przyjmuje instancję klasy T (np do sout-foreach )
        Consumer<Integer>consumer = g->{};
        consumer.accept(10);

        //Predicate<T> zawiera metodę test, która przyjmuje instancję klasy T i zwraca flagę. Interfejs ten może posłużyć do zastąpienia interfejsu Checker
        // np do metody equals
        Predicate<Integer>predicate = b ->b.equals(10);
        System.out.println(predicate.test(10));

        //Supplier<T> zawiera metodę get, która nie przyjmuje żadnych parametrów i zwraca instancję klasy T - np do konstruktora bezparametrowego
        int x = 5 ;
        Supplier<Integer> supplier = () -> x * x;
        System.out.println(supplier.get());

        //OPERATOR przypisania metody do instancji klasy bez jej wywoływania ::
        Object o = new Object();
        LongSupplier longSupplier = o::hashCode;
        System.out.println(longSupplier.getAsLong());

        //przypisanie metody bez podanie instancji klasy oraz bez jej wywołania::
        ToLongFunction<Object>longSupplier1 = Object::hashCode;
        Object o1 = new Object();
        System.out.println(longSupplier1.applyAsLong(o1));

        //odwolanie sie do konstruktora
        Supplier<Object>objectSupplier = Object::new;
        System.out.println(objectSupplier.get());

        //ZADANIE
        //Załóżmy, że chcemy wypisać na konsoli liczby znajdujące się w kolekcji.
        //1 sposob to petla
        System.out.println("1 sposob");
        List<Integer>list = Arrays.asList(1,2,3,4);
        for (Integer p : list) {
            System.out.println(p);
        }
        //2 sposob za pomoca lambdy
        System.out.println("2 sposob");
        List<Integer>list1 = Arrays.asList(1,2,3,4);
        Consumer<Integer>integerUnaryOperator = n-> System.out.println(n);
        list1.forEach(integerUnaryOperator);
        //3 sposob odwolanie sie do metody
        System.out.println("3 sposob");
        List<Integer>list2 = Arrays.asList(1,2,3,4);
        list2.forEach(System.out::println);
    }
}
