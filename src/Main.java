import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resWater = 2000;
        int resMilk = 2000;
        int resCoffee = 2000;
        double resMoney = 0;

        boolean machineIsOn = true;
        while (machineIsOn){
            System.out.println("Please choose your drink/report/off...");


            // TODO 1: first choice - report/Drink/off
            Scanner scan = new Scanner(System.in);
            String choice = scan.nextLine();
            double price = 0;

            switch (choice){
                case "off" -> machineIsOn = false;
                case "report" -> System.out.println("REPORT: \nWater: " + resWater + "\nMilk: " + resMilk + "\nCoffee: " + resCoffee + "\nMoney: " + resMoney);
                // TODO 2: order a drink
                case "espresso" -> {
                    price = 1.5;
                    if (resWater >= 50 && resMilk >= 0 && resCoffee >= 18){
                        System.out.println("espresso");
                    }else{
                        System.out.println("not enough ressource... please another order...");
                    }
                }
                case "latte" -> {
                    price = 2.5;
                    if (resWater >= 200 && resMilk >= 150 && resCoffee >= 24){
                        System.out.println("latte");
                    }else{
                        System.out.println("not enough ressource... please another order...");
                    }
                }
                case "cappuccino" -> {
                    price =3;
                    if (resWater >= 250 && resMilk >= 100 && resCoffee >= 24){
                        System.out.println("cappuccino");
                    }else{
                        System.out.println("not enough ressource... please another order...");
                    }
                }
                default -> System.out.println("I'm sorry but there is no such order... please make a new one...");
            }


            // TODO 3: pay the bill
            System.out.println("Your Drink cost " + price + "$. \nPlease insert the right amount of money...");
            double moneyInsert = scan.nextDouble();
            if (moneyInsert < price){
                System.out.println("\nSorry, that's not enough. Please make a new order...");
                machineIsOn = false;

                // TODO 4: make drink
            } else{
                System.out.println("Please enjoy your drink...");
            }




        }



    }

}