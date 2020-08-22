package pl.poznanski.transport_company.genericType;

import lombok.Data;

@Data
public class Client<T> {

    private T clientName;


    public  Client(T clientName){
        this.clientName=clientName;
    }
    public T getClientName(){
        return clientName;
    }
}
