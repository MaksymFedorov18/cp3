public class Main {
    public static void main(String[] args) {
        SMS sms = new SMS("Hello, I'll be there in 5 minutes!", "123-555-9876");
        sms.send();  
        
        System.out.println();

        Email email = new Email("Item sale", "Your item has been sold.", "jeff3355@gmail.com");
        email.send();
    }
}

