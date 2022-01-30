package oop;

public class Main {
    public static void main(String[] args) {
        Book novel = new Book("''The Unbearable Lightness of Being''", "Philosophical Fiction",
                new String[]{"Franz", "Sabina", "Teresa", "Tomas"}, true);
        novel.setCoverType("hardcover");
        novel.setPages(384);
        System.out.println(novel);
        Author author = new Author("Milan", "Kundera", "Czech", (byte)92);
        author.setPseudonym("Emil Werner");
        System.out.println("\n" + author);
    }
}
