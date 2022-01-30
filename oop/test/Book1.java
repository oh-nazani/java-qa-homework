package oop.test;

import oop.PublishedMaterial;

import java.util.Arrays;

public class Book1 extends PublishedMaterial {

    private String genre;
    private String[] characters;
    private boolean hasArmenianTranslation;

    public Book1(String title, String genre, String[] characters, boolean hasArmenianTranslation) {
        super(title);
        this.genre = genre;
        this.characters = characters;
        this.hasArmenianTranslation = hasArmenianTranslation;
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

    public boolean HasArmenianTranslation() {
        return hasArmenianTranslation;
    }

    public void setHasArmenianTranslation(boolean hasArmenianTranslation) {
        this.hasArmenianTranslation = hasArmenianTranslation;
    }

    @Override
    public String toString() {
        return "Book:" +
                "\n title=" + getTitle() +
 //               "\n author=" + getAuthor() +
                "\n coverType='" + getCoverType() +
                "\n genre=" + genre +
                "\n characters=" + Arrays.toString(characters) +
                "\n hasArmenianTranslation=" + hasArmenianTranslation;
    }

}
