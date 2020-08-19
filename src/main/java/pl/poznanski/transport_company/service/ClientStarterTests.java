package pl.poznanski.transport_company.service;

import pl.poznanski.transport_company.genericType.Client;
import pl.poznanski.transport_company.genericType.FamelClient;
import pl.poznanski.transport_company.genericType.MaleClient;

public class ClientStarterTests {
    public static void main(String[] args) {
        //Tworze obiekt klasy Client, oraz definiuje atrybuty, pola(clientName) jako String
        Client<String> client = new Client<String>("Weronika");
        System.out.println(client.getClientName());
        //Tworze obiekt klasy Client, oraz definiuje atrybuty, pola(clientName) jako Integer
        Client<Integer> client2 = new Client<Integer>(21);
        System.out.println(client2.getClientName());

        //użycie słowa extends do tego by ogarniczyc dzialanie ilosci klas.
        Client<MaleClient>maleClient = new Client<>(new MaleClient());
        System.out.println(maleClient.getClientName());

        Client<FamelClient>famelClient = new Client<>(new FamelClient());
        System.out.println(famelClient.getClientName());

        Client<Object>objectClient = new Client<>(new Object());
        System.out.println(objectClient.getClientName());
    }
}

