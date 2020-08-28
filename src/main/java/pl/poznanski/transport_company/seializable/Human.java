package pl.poznanski.transport_company.seializable;

import java.io.*;
import java.util.Calendar;
//serializacja sluzy do przesylania stanu instancji obiektu danej klasy za pomoca zapisu bajtowego

//Napisz klasę Human, która będzie miała dwa atrybuty name typu String oraz age typu int.
// Jak należałoby serializować instancje tej klasy aby zawsze poprawnie deserializować wiek
// (z dokładnością do roku)? (Wskazówka, możesz użyć metody Calendar.getInstance().get(Calendar.YEAR), która zwraca aktualny rok)
public class Human implements Serializable {
    private String name;
    private transient int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("age.bin"))){
            outputStream.writeObject(new Human("Piotr",21));
        }
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("age.bin"))){
            Human human = (Human) objectInputStream.readObject();
            System.out.println(human.name);
            System.out.println(human.age);
        }
    }
    //metody pokazujace serializacji jak ma odczytac i zapisac atrybut age klasy human.
    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        int birthYear = stream.readInt();
        age= Calendar.getInstance().get(Calendar.YEAR)-birthYear;
    }
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        int birthYear = Calendar.getInstance().get(Calendar.YEAR)-age;
        stream.writeInt(birthYear);
    }
}
