package oop.test;

import oop.Author;

public class PublishedMaterial1 {

    private String title;
    private Author author;
    private String coverType;
    private int pages;

    public PublishedMaterial1(String title, Author author, String coverType, int pages) {
        this.title = title;
        this.author = author;
        this.coverType = coverType;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("The value must be a natural number, try again.");
        }
    }

    @Override
    public String toString() {
        return "PublishedMaterial1{" +
                "title= " + title +
                "\n author=" + author +
                "\n coverType='" + coverType +
                "\n pages=" + pages;
    }
}
