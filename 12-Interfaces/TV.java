public class TV implements CanOnOff, CanChangeChannel {
    private boolean isOn;
    private int currentChannel;
    private int currrentVolume;

    public TV() {
        this.isOn = false;
        this.currentChannel = 1; 
        this.currrentVolume = 1;
    }

    public void on() {
        isOn = true;
        currentChannel = 1; 
    }

    public void off() {
        isOn = false;
    }

    public void channelUp() {
        if (isOn) {
            if (currentChannel < 99) {
                currentChannel++;
                System.out.println("Channel changed to: " + currentChannel);
            } else {
                System.out.println("Already at the highest channel (99).");
            }
        } else {
            System.out.println("Cannot change channel. The TV is off.");
        }
    }

    public void channelDown() {
        if (isOn) {
            if (currentChannel > 1) {
                currentChannel--;
                System.out.println("Channel changed to: " + currentChannel);
            } else {
                System.out.println("Already at the lowest channel (1).");
            }
        } else {
            System.out.println("Cannot change channel. The TV is off.");
        }
    }

    public void setChannel(int channelNo) {
        if (isOn) {
            if (channelNo >= 1 && channelNo <= 99) {
                currentChannel = channelNo;
                System.out.println("Channel set to: " + currentChannel);
            } else {
                System.out.println("Invalid channel number. Please choose a number between 1 and 99.");
            }
        } else {
            System.out.println("Cannot set channel. The TV is off.");
        }
    }

    public void VolumeUp() {
        if (isOn) {
            if (currrentVolume < 10) {
                currrentVolume++;
                System.out.println("Volume changed to: " + currrentVolume);
            } else {
                System.out.println("Already at the maximum volume (10).");
            }
        } else {
            System.out.println("Cannot change volume. The TV is off.");
        }
    }

    public void VolumeDown() {
        if (isOn) {
            if (currrentVolume > 1) {
                currrentVolume--;
                System.out.println("Volume changed to: " + currrentVolume);
            } else {
                System.out.println("Already at the lowest volume (1).");
            }
        } else {
            System.out.println("Cannot change volume. The TV is off.");
        }
    }
    
    public void displayStatus() {
        if (isOn) {
            System.out.println("The TV is currently on. Channel: " + currentChannel + ". Volume: " + currrentVolume);
        } else {
            System.out.println("The TV is currently off.");
        }
    }
}
