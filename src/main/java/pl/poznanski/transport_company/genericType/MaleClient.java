package pl.poznanski.transport_company.genericType;

public class MaleClient <T>{

    private T age;

    public MaleClient(T age){
            this.age=age;
            }

    public MaleClient(){
            }

    public T getAge(){
            return age;
            }
}
