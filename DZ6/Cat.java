
public class Cat {

    int age;
    String name;
    String owner;
    Boolean vaccination;

    public String toString() {
        return String.format("Name: %s\n Owner: %s\n Age: %d\n Vaccination: %s\n", name, owner, age, vaccination);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isVaccination() {
        return vaccination;
    }
}
