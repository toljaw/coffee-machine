public class BrewingUnit {
    // Attribute:
    // no need for?: String choice;
    int resWater;
    int resMilk;
    int resCoffee;
    double resMoney;

    // Konstruktor:
    public BrewingUnit(int resWater, int resMilk, int resCoffee, double resMoney) {
        //this.choice = choice;
        this.resWater = resWater;
        this.resMilk =resMilk;
        this.resCoffee = resCoffee;
        this.resMoney = resMoney;
    }

    // Methoden:
    public void report() {
        System.out.println("Your resources: \n\nWATER: " + this.resWater + " ml\nMILK: " + this.resMilk + " ml\nCOFFEE: " + this.resCoffee + " ml\nMONEY: " + this.resMoney + " $");
    }
    //OrderDrink...
    //MakeDrink...

}
