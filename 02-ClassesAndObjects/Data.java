public class Data {
    public static void main(String[] args) {
        double cm = 170; 
        convertCmToFeetAndInches(cm);
    }

    public static void convertCmToFeetAndInches(double cm) {
        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        int remainingInches = (int) Math.round(inches % 12);

        System.out.println(cm + " cm is approximately " + feet + " feet and " + remainingInches + " inches.");
    }
}
