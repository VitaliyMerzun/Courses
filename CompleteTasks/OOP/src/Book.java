public class Book {

    public String title;

    public Author author;

    public int date;

    public Book(String title, Author author, int date){
        this.title = title;
        this.author = author;
        this.date = date;
    }

    public Author getAuthor() { return author; }
    public int getDate() { return date; }

    public void setAuthor(Author author) { this.author = author; }
    public void setDate(int date) { this.date = date; }

    public String toString() {
        return author.toString() + " " + date;
    }
}
