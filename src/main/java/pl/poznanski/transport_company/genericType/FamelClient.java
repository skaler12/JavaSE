package pl.poznanski.transport_company.genericType;

public class FamelClient<T> {
    private T age;

    public FamelClient(T age) {
        this.age = age;
    }

    public FamelClient() {

    }

    public T getAge() {
        return age;
    }
}
