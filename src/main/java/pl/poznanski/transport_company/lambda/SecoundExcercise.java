package pl.poznanski.transport_company.lambda;

import java.util.function.Predicate;
import java.util.function.Supplier;

//Napisz program, który wywoła funkcję equals na instancji klasy Object używając mechanizmu odwoływania się do metody (przy pomocy ::).
public class SecoundExcercise {
    public static void main(String[] args) {

        Supplier<Object> supplier = Object::new;
        Object objectInstance = supplier.get();

        Predicate<Object> objectPredicate = objectInstance::equals;
        System.out.println(objectPredicate.test(new Object()));

    }
}
