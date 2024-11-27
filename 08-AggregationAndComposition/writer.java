public class writer {
    private String name;
    private int age;
    private int nOfBooks;

    public writer(String name, int age, int nOfBooks) {
        this.name = name;
        this.age = age;
        this.nOfBooks = nOfBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getnOfBooks() {
        return nOfBooks;
    }

    public void setnOfBooks(int nOfBooks) {
        this.nOfBooks = nOfBooks;
    }

    public void writeBook() {
        System.out.println(name + " has written a book.");
    }

    public void openBook() {
        System.out.println(name + " opens the book.");
    }

    public void postBook() {
        System.out.println(name + " has posted a book.");
    }

    public static void main(String[] args) {
        
    }
}
