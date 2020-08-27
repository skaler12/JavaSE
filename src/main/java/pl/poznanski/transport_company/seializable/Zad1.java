package pl.poznanski.transport_company.seializable;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Napisz program, który poprosi użytkownika o wprowadzenie kilku imion, imiona te zapisz w liście a następnie zserializuj
// ją do pliku. Napisz metodę, która odczyta ten plik i wyświetli zawartość listy na konsoli. Wiesz, że właśnie napisałeś prostą
// bazę danych? ;)
public class Zad1 implements Serializable {
    public static final String STOP = "-";
    private static final long serialVersionUID = -8595418797303301224L;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("names.db"))){
            outputStream.writeObject(setNames());
        }
        LinkedList<String>names = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("names.db"))){
            names = (LinkedList<String>) objectInputStream.readObject();
        }
        names.forEach(System.out::println);
    }
    public static final List<String> setNames() throws IOException {
        LinkedList<String>names= new LinkedList<>();
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Podaj imie");
            String name = in.nextLine();
            if(name.equals(STOP)){
                break;
            }
            names.add(name);
        }
        return names;
    }
}
