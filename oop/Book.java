package oop;

import java.util.Arrays;

public class Book extends PublishedMaterial {
    private Author author;
    private String genre;
    private String[] characters;
    private boolean hasArmenianTranslation;

    public Book (String title, String genre, String[] characters, boolean hasArmenianTranslation){
        super(title);
        this.genre = genre;
        this.characters = characters;
        this.hasArmenianTranslation = hasArmenianTranslation;
    }
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String[] getCharacters() {
        return characters;
    }

    public void setCharacters(String[] characters) {
        this.characters = characters;
    }

    public boolean isHasArmenianTranslation() {
        return hasArmenianTranslation;
    }

    public void setHasArmenianTranslation(boolean hasArmenianTranslation) {
        this.hasArmenianTranslation = hasArmenianTranslation;
    }

    @Override
    public String toString() {
        return "Book:" +
                "\n title=" + getTitle() +
                "\n genre=" + genre +
                "\n characters=" + Arrays.toString(characters) +
                "\n coverType=" + getCoverType() +
                "\n pages=" + getPages() +
                "\n hasArmenianTranslation=" + hasArmenianTranslation;
//                "\nAuthor:" +
//                "\n firstName=" + getAuthor().getFirstName() +
//                "\n lastName=" + getAuthor().getLastname() +
//                "\n nationality=" + getAuthor().getNationality()+
//                "\n age=" + getAuthor().getAge() +
//                "\n pseudonym=" + getAuthor().getPseudonym();

    }


}
