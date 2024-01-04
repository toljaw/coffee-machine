

public class Main {
    public static void main(String[] args) {
        BrewingUnit brew1 = new BrewingUnit(2000,2000,1500,0);

        String choice = "espresso";
        Recipe recEspresso = new Recipe("espresso",150,0,18,1.5);
        Recipe recLatte = new Recipe("latte",200,150,24,2);
        Recipe recCappuccino = new Recipe("cappuccino",250,200,24,2.5);

        brew1.report();

    }
}