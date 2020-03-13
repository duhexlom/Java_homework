package Homework.Object;

public class Pet {
    private Integer id;
    private String name;
    private Person owner;
    private Integer weight;

    public Pet(Integer id, String name, Person owner, Integer weight) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public Pet setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Pet setName(String name) {
        this.name = name;
        return this;
    }

    public Person getOwner() {
        return owner;
    }

    public Pet setOwner(Person owner) {
        this.owner = owner;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public Pet setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + owner + ", " + weight;
    }
}
