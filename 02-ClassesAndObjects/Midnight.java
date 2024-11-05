public class Midnight {
    int hours = 14;   // Example hour
    int minutes = 27; // Example minutes

    public static int minutesFromMidnight(int hours, int minutes) {
        return hours * 60 + minutes; // Return the total minutes
    }

    public static int secondsFromMidnight(int total_min) {
        return total_min * 60; // Return the total seconds
    }

    public static void main(String[] args) {
        Midnight m = new Midnight();
        
        // Display the time in hh:mm format
        System.out.printf("Time: %02d:%02d%n", m.hours, m.minutes);
        
        // Calculate minutes and seconds from midnight
        int total_min = minutesFromMidnight(m.hours, m.minutes); 
        int total_sec = secondsFromMidnight(total_min); 
        
        // Display the results
        System.out.println("Minutes from midnight: " + total_min);
        System.out.println("Seconds from midnight: " + total_sec);
    }
}
