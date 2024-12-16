public class Email extends Message {
    private String subject;
    private String recipientEmail;

    public Email(String subject, String text, String recipientEmail) {
        super(text); 
        this.subject = subject;
        this.recipientEmail = recipientEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public void send(){
        System.out.println("Sending email to: " + recipientEmail);
        System.out.println("Subject: "+ subject);
        System.out.println("Message: " + getText());
        System.out.println("Character Count: " + charNumber());
    }
    
}