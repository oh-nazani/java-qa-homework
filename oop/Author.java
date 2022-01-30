package oop;

public class Author extends Human {
      private String pseudonym;

    public Author(String firstName, String lastName, String nationality, byte age) {
        super(firstName, lastName, nationality,age);
    }

    public String getPseudonym() { return pseudonym;}

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastname() + '\'' +
                ", nationality='" + getNationality() + '\'' +
                ", age=" + getAge() +
                ", pseudonym='" + pseudonym + '\'' +
                '}';
    }
}
