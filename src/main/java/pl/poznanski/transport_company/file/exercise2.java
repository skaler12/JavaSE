package pl.poznanski.transport_company.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//Napisz program, który pobierze od użytkownika ścieżkę do
// pliku i wyświetli zawartość pliku na ekranie wraz z informacją ile linii znajduje się w pliku.
public class exercise2 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        // C:\\Users\\Grzegorz\\Desktop\\IntellijProjects\\transport_company\\src\\main\\java\\pl\\poznanski\\transport_company\\file\\ex1.txt
        System.out.println("Podaj ścieżkę pliku konfiguracyjnego");
        String path = in.nextLine();
        String line;
        int numberOfLines=0;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String textWithFile = bufferedReader.readLine();
            System.out.println(textWithFile);
        }
        finally {
            if(bufferedReader!=null){
                bufferedReader.close();
            }
        }

    }
}
