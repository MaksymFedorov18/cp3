public class Clock {
    private int minute;
    private int hour;

    public Clock(int minute,int hour){
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            this.hour = 0;  // Default to 0 if the hour is invalid
        }
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        } else {
            this.minute = 0;  // Default to 0 if the minute is invalid
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        }
    }

    public void addMinute() {
        minute++;
        if (minute == 60) {
            minute = 0;  // Reset minutes to 0
            hour++;
            if (hour == 24) {
                hour = 0;  // Reset hour to 0 when it reaches 24
            }
        }
    }

    public void DisplayTime(){
        System.out.printf("%02d:%02d\n", hour, minute);
    }

    public static void main(String[] args) {
        Clock c = new Clock(60, 20);
        c.setHour(10);
        c.DisplayTime();
    }


}
