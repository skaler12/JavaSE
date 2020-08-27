package pl.poznanski.transport_company.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Napisz program, który pobierze od użytkownika ścieżkę do pliku tekstowego oraz kilka linijek tekstu
// (dopóki użytkownik nie wprowadzi „-” jako linijki) i zapisze je do pliku tekstowego. Do wykonania tego zadania może
// Ci się przydać metoda System.lineSeparator() zwracająca znak nowej linii (jeśli chciałbyś oddzielić linie wprowadzone przez użytkownika).
public class exercise1 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        // C:\\Users\\Grzegorz\\Desktop\\IntellijProjects\\transport_company\\src\\main\\java\\pl\\poznanski\\transport_company\\file\\ex1.txt
        System.out.println("Podaj ścieżkę pliku konfiguracyjnego");
        String path = in.nextLine();
        System.out.println("Podaj tekst który chcesz zapisac do pliku! ");
        String text = in.nextLine();

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(path);
            fileWriter.write(text);
        }
        finally {
            if(fileWriter!=null){
                fileWriter.close();
            }
        }
    }
}
