
class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title, author); 
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Thiis is E-Book.");
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("File Name: " + fileName);
       
    }

    public static void main(String[] args) {

        Ebook ebook = new Ebook("1984", "George Orwell", "1984.pdf");
        ebook.display();
    }
}

