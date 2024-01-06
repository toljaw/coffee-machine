public class BrewingUnit {
    // Attribute:
    String drink;
    int resWater;
    int resMilk;
    int resCoffee;
    double resMoney;
    boolean resources;

    // Constructor:
    public BrewingUnit(String drink, int resWater, int resMilk, int resCoffee, double resMoney, boolean resources) {
        this.drink = drink;
        this.resWater = resWater;
        this.resMilk = resMilk;
        this.resCoffee = resCoffee;
        this.resMoney = resMoney;
        this.resources = resources;
    }

    // Methoden:
    public void report() {
        System.out.println("\nWATER: " + this.resWater + " ml\nMILK: " + this.resMilk + " ml\nCOFFEE: " + this.resCoffee + " ml\nMONEY: " + this.resMoney + " $\n");
    }
    Recipe recEspresso = new Recipe("espresso",50,0,18,1.5);
    Recipe recLatte = new Recipe("latte",200,150,24,2.5);
    Recipe recCappuccino = new Recipe("cappuccino",250,100,24,3);

    //CheckResources...
    public boolean resources() {

        switch(this.drink){
            case "espresso" -> {
                return this.resWater >= recEspresso.water && this.resMilk >= recEspresso.milk && this.resCoffee >= recEspresso.coffee;
            }
            case "latte" -> {
                return this.resWater >= recLatte.water && this.resMilk >= recLatte.milk && this.resCoffee >= recLatte.coffee;
            }
            case "cappuccino" -> {
                return this.resWater >= recCappuccino.water && this.resMilk >= recCappuccino.milk && this.resCoffee >= recCappuccino.coffee;
            }
            default -> {
                return false;
            }
            
        }


    }

    //MakeDrink...
    public void makeDrink() {
        this.resWater -= recEspresso.water;
        this.resMilk -= recEspresso.milk;
        this.resCoffee -= recEspresso.coffee;
        System.out.println("Thanks for your order. Enjoy your " + this.drink);
    }

}
