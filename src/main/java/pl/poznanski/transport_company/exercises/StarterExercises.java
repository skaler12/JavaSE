package pl.poznanski.transport_company.exercises;

import pl.poznanski.transport_company.stream.Employee;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StarterExercises {
    //Znajdz najwieksza populacje ludzi w poszczegolnych miastach w danych krajach i max populacje z wszystkich miast z wszystkich krajow
    public static void main(String[] args) {

        List<City> PolskieMiasta= new ArrayList<>();
        City zamosc = new City();
            zamosc.setName("zamosc");
            zamosc.setPopulation(72000);

        City krakow = new City();
        zamosc.setName("krakow");
        zamosc.setPopulation(922000);

        City warszawa = new City();
        zamosc.setName("warszawa");
        zamosc.setPopulation(1472000);

        PolskieMiasta.add(zamosc);
        PolskieMiasta.add(krakow);
        PolskieMiasta.add(warszawa);

        Country Polska = new Country();
        Polska.setName("Polska");
        Polska.setCities(PolskieMiasta);

        List<City> KanadyjskiMiasta= new ArrayList<>();
        City Toronto = new City();
        zamosc.setName("toronto");
        zamosc.setPopulation(2372000);

        City Montreal = new City();
        zamosc.setName("montreal");
        zamosc.setPopulation(1922000);

        City Ottawa = new City();
        zamosc.setName("ottawa");
        zamosc.setPopulation(213000);

        KanadyjskiMiasta.add(Toronto);
        KanadyjskiMiasta.add(Montreal);
        KanadyjskiMiasta.add(Ottawa);

        Country Kanada = new Country();
        Polska.setName("Kanada");
        Kanada.setCities(KanadyjskiMiasta);


        //najwieksza populacja miasta w polsce
        City miastoPolskieZMaxPopulacja = PolskieMiasta
                .stream()
                .max(Comparator.comparingInt(x -> x.getPopulation())).get();
        System.out.println(miastoPolskieZMaxPopulacja.getPopulation());

       final List<Country>listaKraji = new ArrayList<>();
        listaKraji.add(Polska);
        listaKraji.add(Kanada);

        List<City>cities = listaKraji
                .stream()
                .map(country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        cities.forEach(System.out::println);


        System.out.println("----------------------------------------");

        //zadanie 2 filmy
        List<Movie>movies = Arrays.asList(
                new Movie(1,"W Samo Popołudnie"),
                new Movie(2,"4 pancerni i pies"),
                new Movie(3,"James Bond"),
                new Movie(4,"Cristal"));

        //wyswietlenie hashcode wszystkich filmow
        movies.stream()
                .map(Movie::hashCode)
                .forEach(s -> System.out.println(s));
        //sprawdzam czy wszystkie id filmow sa poniezej watsci 5
        Boolean ifIdLessThen5 = movies.stream()
                .allMatch(movie -> (movie.getId()<5));
        System.out.println(ifIdLessThen5);
        //sortowanie wzgledem id 1 filmu - id 2 nastepnego filmu.
        List<Movie> movies1 = movies.stream()
                .sorted((o1, o2) -> (o2.getId()-o1.getId()))
                .collect(Collectors.toList());
        System.out.println(movies1.toString());
        //wyswietlilem wszystkie filmy zawierajace litere "i".
        movies.stream()
                .filter(moe -> moe.getTitle().contains("i"))
                .forEach(System.out::println);
        //flatMap - z listy w liście , tworze 1 liste z tymi elementami
        List<List<Integer>>listaZList=Arrays.asList(
                Arrays.asList(2,3,4),
                Arrays.asList(2,3,4,1),
                Arrays.asList(6,4)
        );
        List<Integer>listProsta=listaZList.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(listProsta.toString());
        //reduce
        List<Employee> employees2 =
                Arrays.asList(
                        new Employee(1, 2000d, "Risk Department", Employee.DayJob.FULL_TIME),
                        new Employee(2,2500d, "Scoring Department", Employee.DayJob.FULL_TIME),
                        new Employee(3,2600d, "Scoring Department", Employee.DayJob.FULL_TIME),
                        new Employee(4,2700d, "Credit Department", Employee.DayJob.FULL_TIME),
                        new Employee(5,2700d, "Credit Department", Employee.DayJob.PART_TIME)
                );
        System.out.println();


        //to samo za pomoca mapToDouble
        double suma = employees2.stream()
                .filter(employee2 -> (employee2.getDayJob().equals(Employee.DayJob.FULL_TIME)))
                .mapToDouble(v -> v.getSalary()).sum();
        System.out.println(suma);
        //to samo za pomoca reduce
        Double salariesSumForFullTimeEmployees =
                employees2
                        .stream()
                        .filter(employee2 -> employee2.getDayJob().equals(Employee.DayJob.FULL_TIME))
                        .map(Employee::getSalary)
                        .reduce(0.0, Double::sum);
        System.out.println(salariesSumForFullTimeEmployees);
    }
}
