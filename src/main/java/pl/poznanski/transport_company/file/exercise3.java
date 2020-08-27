package pl.poznanski.transport_company.file;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//Napisz program, który poprosi użytkownika nazwę pliku wyjściowego oraz o podanie swojej daty urodzenia
// (osobno dzień, miesiąc i rok), a następnie zapisze te dane jako trzy osobne liczby binarnie.
public class exercise3 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // C:\\Users\\Grzegorz\\Desktop\\IntellijProjects\\transport_company\\src\\main\\java\\pl\\poznanski\\transport_company\\file\\ex3.txt
        System.out.println("Podaj sciezke do pliku: ");
        String filePath = input.nextLine();

        System.out.println("Podaj dzien urodzenia: ");
        int birthDay = input.nextInt();

        System.out.println("Podaj miesiac urodzenia: ");
        int birthMonth = input.nextInt();

        System.out.println("Podaj rok urodzenia: ");
        int birthYear = input.nextInt();

        DataOutputStream output = null;
        try {
            output = new DataOutputStream(new FileOutputStream(filePath));
            output.writeInt(birthDay);
            output.writeInt(birthMonth);
            output.writeInt(birthYear);
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }
}
