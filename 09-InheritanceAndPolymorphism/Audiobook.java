public class Audiobook extends Book {
    private int minutes;
    private int hours;

    public Audiobook(String title, String author, int hours, int minutes) {
        super(title, author); 
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public void display(){
        System.out.println("This is audiobook.");
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Duration: "+ hours + ":" + minutes);
    }

    public static void main(String[] args) {
        Audiobook ab = new Audiobook("1984", "Pup", 2, 20);
        ab.display();
    }
    
}
