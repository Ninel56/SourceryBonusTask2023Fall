
public class Main {
    public static void main(String[] args) {
        BonusDatesFinder bonusDatesFinder = new BonusDatesFinder();
        try {
            bonusDatesFinder.printBonusDatesBetween(2010, 2015); // example
        } catch (Exception e) {
            System.out.println("An error occurred, program stopping");
        }

    }

}