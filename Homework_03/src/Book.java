import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String genre;
    private int pageCount;

    public Book() {}

    public Book(String title, String author, int year, String publisher, String genre, int pageCount) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.pageCount = pageCount;
    }

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the book title: ");
        title = scanner.nextLine();
        System.out.print("Enter the author's name: ");
        author = scanner.nextLine();
        System.out.print("Enter the publication year: ");
        year = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.print("Enter the publisher's name: ");
        publisher = scanner.nextLine();
        System.out.print("Enter the genre: ");
        genre = scanner.nextLine();
        System.out.print("Enter the page count: ");
        pageCount = scanner.nextInt();
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + year);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
        System.out.println("Page Count: " + pageCount);
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
