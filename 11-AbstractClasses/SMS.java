public class SMS extends Message {
    private String phoneNumber;

    public SMS(String text, String phoneNumber) {
        super(text);  
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void send(){
        System.out.println("Sending SMS to: " + phoneNumber);
        System.out.println("Message: " + getText());
        System.out.println("Character Count: " + charNumber());
    }
    
}