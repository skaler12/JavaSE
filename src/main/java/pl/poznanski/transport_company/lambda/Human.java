package pl.poznanski.transport_company.lambda;

public class Human {

    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public Human(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
