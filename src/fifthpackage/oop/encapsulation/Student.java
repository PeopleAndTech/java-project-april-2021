package fifthpackage.oop.encapsulation;

public class Student {
    // encapsulation : data hiding

    private String name;
    private int id;
    private String location;
    private String gender;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String nameFromMethod) {
        this.name = nameFromMethod;
    }

    public int getId() {
        return id;
    }

    public void setId(int idFromMethod) {
        this.id = idFromMethod;
    }

    // testing the api's
    @Override
    public String toString() {
        return "Student{" +
                "name='" + "Mr." + name + '\'' +
                ", id=" + id +
                ", location='" + location + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
