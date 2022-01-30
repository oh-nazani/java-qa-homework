package oop;

public class PublishedMaterial {
    private String title;
    private String coverType;
    private int pages;

       public PublishedMaterial(String title) {
        this.title = title;
    }

    public PublishedMaterial() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            System.out.println("The value must be a natural number, try again.");
        }
    }

}
