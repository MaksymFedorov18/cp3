public class Main {
    public static void main(String[] args) {
        writer writer1 = new writer("J.K. Rowling", 55, 7);
        book book1 = new book("Harry Potter and the Sorcerer's Stone", "Fantasy", 1997, writer1);

        System.out.println("Writer: " + writer1.getName() + ", Age: " + writer1.getAge());
        System.out.println("Book: " + book1.getTitle() + ", Genre: " + book1.getGenre() + ", Year: " + book1.getYear());

        writer1.writeBook();
        writer1.openBook();
        writer1.postBook();

        book1.openBook();
        book1.closeBook();
        book1.makeBookmark();
    }
}
