package kosta.basic.day024;

public class Book {

    private int bookId;
    private String title;
    private String publisher;
    private String publishDate;
    private int authorId;

    public Book(int bookId, String title, String publisher, String publishDate, int authorId) {
        this.bookId = bookId;
        this.title = title;
        this.publisher = publisher;
        this.publishDate = publishDate;
        this.authorId = authorId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public int getAuthorId() {
        return authorId;
    }
}
