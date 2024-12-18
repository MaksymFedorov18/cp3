public class Main {
    public static void main(String[] args) {
        TV myTV = new TV();
        
        myTV.on();
        myTV.displayStatus();
        myTV.setChannel(15);
        myTV.VolumeUp();
        myTV.VolumeUp();
        myTV.VolumeUp();
        myTV.VolumeUp();
        myTV.VolumeUp();
        myTV.VolumeUp();
        myTV.displayStatus();
        myTV.off();
        myTV.displayStatus();
    }
}
