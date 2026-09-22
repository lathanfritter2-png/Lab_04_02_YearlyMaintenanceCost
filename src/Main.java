public class Main {
    public static void main(String[] args) {

        double springCost = 500.00;
        double summerCost = 400.00;
        double fallCost = 300.00;
        double winterCost = 600.00;
        double yearlyCost = 0.0;

        yearlyCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + yearlyCost);
    }
}
