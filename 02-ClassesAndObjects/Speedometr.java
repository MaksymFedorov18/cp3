public class Speedometr {
    int speed = 90;
    int lBound = 40;
    int hBound = 140;
    String result;

    public void checkSpeed() {
        if (speed < lBound) {
            result = "False";
        } else if (speed > hBound) {
            result = "False";
        } else {
            result = "True";
        }
    }

    public static void main(String[] args) {
        Speedometr speedometr = new Speedometr(); 
        speedometr.checkSpeed(); 
        System.out.println("Vehicle speed: "+ speedometr.speed);
        System.out.println("Speed is valid: "+ speedometr.result);
    }


}
