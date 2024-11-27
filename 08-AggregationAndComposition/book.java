public class book {
    private String title;
    private String genre;
    private int year;
    private writer author;
    Chapter chapters;  

    public book(String title, String genre, int year, writer author) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void openBook() {
        System.out.println("The book \"" + title + "\" is opened.");
    }

    public void closeBook() {
        System.out.println("The book \"" + title + "\" is closed.");
    }

    public void makeBookmark() {
        System.out.println("Bookmark is made for \"" + title + "\".");
    }

    public writer getAuthor() {
        return author;
    }

    public void setAuthor(writer author) {
        this.author = author;
    }
}
