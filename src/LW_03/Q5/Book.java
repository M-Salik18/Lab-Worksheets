package LW_03.Q5;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public void displayInfo(){
        System.out.println("Book Name: "+title);
        System.out.println("Author\'s name: "+author);
        System.out.println("ISBN Number: "+ISBN);
        System.out.println("Is it available? "+available);
    }
}
