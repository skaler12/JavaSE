package pl.poznanski.transport_company.exercises;

public class Genre {
    private int id;
    private String name;

    public Genre() {
    }

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // getters and setters

    @Override
    public String toString() {
        return "Genre [id=" + id + ", name=" + name + "]";
    }

}