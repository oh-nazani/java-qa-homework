package oop;

public class Human {

    private String firstName;
    private String lastName;
    private String nationality;
    private byte age;

    public Human (String firstName, String lastName, String nationality, byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastName;
    }
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("The value is out of the [0; 100] range, try again.");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "\n firstName=" + firstName + '\'' +
                "\n lastName=" + lastName + '\'' +
                "\n nationality=" + nationality + '\'' +
                "\n age=" + age;
    }
}
