package pl.poznanski.transport_company.genericType;

public class MaleClient <T,C>{

    private T age;

    public MaleClient(T age){
            this.age=age;
            }

    public MaleClient(){
            }

    public T getAge(){
            return age;
            }
    public C get(C something){
        return something;
    }
}
