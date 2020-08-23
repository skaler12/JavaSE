package pl.poznanski.transport_company.lambda;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

//Napisz program, który pobierze o użytkownika cztery łańcuchy znaków, które umieścisz w liście.
// Następnie posortuj tę listę używając metody List.sort.
//użyj wyrażenia lambda, które posortuje łańcuchy znaków malejąco po długości.
public class FirstExercise {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 4;
        List<String>stringList = new LinkedList<>();
        while (n!=0){
            System.out.println("Podaj " +n+ " wyraz");
            stringList.add(in.nextLine());
            n--;
        }
        Consumer<String>consumer = s -> System.out.println(s);
        stringList.forEach(consumer);
        // lub - stringList.forEach(System.out::println);

        //metoda sort przyjmuje interfejs funkcjyny comparator, ktory porownuje przeslane typy generyczne
        stringList.sort((a,b)->b.length()-a.length());
        System.out.println(stringList);
    }
}
