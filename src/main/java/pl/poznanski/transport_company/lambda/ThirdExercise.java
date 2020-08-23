package pl.poznanski.transport_company.lambda;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

//Utwórz instancję klasy Human przy pomocy mechanizmu odwoływania się do konstruktora (przy pomocy ::)
public class ThirdExercise {
    public static void main(String[] args) {
        // uzycie kontrulktora z 2 argumentami
        BiFunction<Integer,String,Human>humanBiFunction = Human::new;
        Human human = humanBiFunction.apply(12,"Piotr");
        System.out.println(human.getAge());
        System.out.println(human.getName());
        //uzycie konstruktora z 1 argumentem
        Function<Integer,Human>integerStringHumanFunction = Human::new;

        //inne zadanie wprowadzam 2 liczby i sprawdzam ktora jest wekesza i ja wypisuje
        //Napisz wyrażenie lambda, które przyjmuje dwa argumenty typu Integer i zwraca wartość większego z nich.
        BiFunction<Integer,Integer,Integer>odp = (a,b)->{
            if (a > b) {
                return a;
            }
            else {
            return b;}
        };
        System.out.println(odp.apply(4,3));
        //Wykorzystując referencję do konstruktora utwórz obiekt klasy Boolean.
        // Parametrem wejściowym metody jest łańcuch znaków zawierający wartość true lub false

        

    }
}
