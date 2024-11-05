public class Spread {
    double buys = 4.5940;
    double sells = 4.6250;
    double spread = sells - buys;
    
    public static void main(String[] args) {
        Spread bank = new Spread();
        System.out.println("Bunk buys EUR: "+bank.buys);
        System.out.println("Bunk sells EUR: "+bank.sells);
        System.out.printf("Spread: %.4f%n",bank.spread);
    }
}
