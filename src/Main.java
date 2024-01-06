import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BrewingUnit brew1 = new BrewingUnit("",2000,2000,1500,0,true);

        boolean machineOn = true;
        while (machineOn){
            System.out.println("What would you like to drink? ");
            Scanner scan1 = new Scanner(System.in);
            String choice = scan1.nextLine();

            switch (choice) {
                case "report" -> {
                    brew1.report();
                    continue;
                }
                case "off" -> {
                    machineOn = false;
                    continue;
                }
                case "espresso" -> {
                    brew1.drink = choice;
                    System.out.println(brew1.drink);
                    boolean resource = brew1.resources();
                    if (resource) {
                        brew1.makeDrink();
                    } else {
                        System.out.println("not enough resources... make a different order...");
                    }
                }

            }

        }

    }
}