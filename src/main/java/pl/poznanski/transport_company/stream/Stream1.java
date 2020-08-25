package pl.poznanski.transport_company.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {

        Stream<String> namesStream = Stream.of("John", "Marry", "George", "Paul", "Alice", "Ann");
        //wszystkie imiona na litere A i potem z duzej litery je wypisac

        List<String>namesStartedWithA = namesStream
                .filter(name->(name.startsWith("A")))
                .map(name->(name.toUpperCase()))
                .collect(Collectors.toCollection(LinkedList::new));
        namesStartedWithA.forEach(System.out::println);

        //FLAT MAP - splaszczanie z listy w liscie mozemy zrobic 1 liste wszystkich tych elementow
        final List<List<Integer>> slicedIntegers = Arrays.asList(
                Arrays.asList(2, 4, 6),
                Arrays.asList(8, 10, 12),
                Arrays.asList(14, 16)
        );

        final List<Integer> simpleIntegerList =
                slicedIntegers
                        .stream()
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());

        System.out.println("slicedIntegers: " + slicedIntegers);
        //slicedIntegers: [[2, 4, 6], [8, 10, 12], [14, 16]]

        System.out.println("simpleIntegerList: " + simpleIntegerList);
        //simpleIntegerList: [2, 4, 6, 8, 10, 12, 14, 16]

        List<Employee> employees =
                Arrays.asList(
                        new Employee(1, 2000d, "Risk Department", Employee.DayJob.FULL_TIME),
                        new Employee(2,2500d, "Scoring Department", Employee.DayJob.FULL_TIME),
                        new Employee(3,2600d, "Scoring Department", Employee.DayJob.FULL_TIME),
                        new Employee(4,2700d, "Credit Department", Employee.DayJob.FULL_TIME),
                        new Employee(5,2700d, "Credit Department", Employee.DayJob.PART_TIME)
                );
        //REDUCE
        //sumuje zarobki wszystkich pracownikow pracujacych na pelny etat
        Double salariesSumForFullTimeEmployees =
                employees
                        .stream()
                        .filter(employee -> employee.getDayJob().equals(Employee.DayJob.FULL_TIME))
                        .map(Employee::getSalary)
                        .reduce(0.0, Double::sum);
        System.out.println(employees);

        //to samo tylko za pomoca metody mapToDouble
        List<Employee> employees1 =
                Arrays.asList(
                        new Employee(1, 2000d, "Risk Department", Employee.DayJob.FULL_TIME),
                        new Employee(2,2500d, "Scoring Department", Employee.DayJob.FULL_TIME),
                        new Employee(3,2600d, "Scoring Department", Employee.DayJob.FULL_TIME),
                        new Employee(4,2700d, "Credit Department", Employee.DayJob.FULL_TIME),
                        new Employee(5,2700d, "Credit Department", Employee.DayJob.PART_TIME)
                );
        System.out.println();
        Double salar=employees1.stream()
                .filter(employee -> employee.getDayJob().equals(Employee.DayJob.FULL_TIME))
                .mapToDouble(n->n.getSalary()).sum();
        System.out.println(salar);
    }
}
