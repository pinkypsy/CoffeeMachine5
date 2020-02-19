package machine;

import java.util.Scanner;

class Machine {

   private String userType;
    static int waterA = 1200;
     static int milkA = 540;
     static int cbeansA = 120;
      static int cupsA = 9;
      static int money = 550;
    private Scanner sc = new Scanner(System.in);

    void run(){
        String action = "";

        while (!action.equals("exit")) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = sc.nextLine().toLowerCase();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
            }
        }
    }

     private void remaining(){
        System.out.println("The coffee machine has:");
        System.out.println(waterA + " of water");
        System.out.println(milkA + " of milk");
        System.out.println(cbeansA + " of coffee beans");
        System.out.println(cupsA + " of disposable cups");
        System.out.println(money + " of money");
    }

int test(int a){
        return  2;
}

    private void buy(){
        System.out.println("What do you want to buy? \n" +
                "Type: 1 for espresso, 2 for latte, 3 for cappuccino or type 'back' to return");

        userType = sc.nextLine();
            if(!isAvailable()) System.out.println("Out of ingredients");
            else if (userType.equals("1") && isAvailable()) new Espresso();
            else if (userType.equals("2") && isAvailable()) new Latte();
            else if (userType.equals("3") && isAvailable()) new Cappuccino();
            else if (userType.toLowerCase().equals("back")) return;
            else System.out.println("You should type: 1 for espresso, 2 for latte, 3 for cappuccino");
    }

    private boolean isAvailable(){
        //check ingredients
    if (userType.equals("1") & Machine.waterA >= Espresso.WATER &
    Machine.cbeansA >= Espresso.CBEANS & Machine.cupsA > 0) return true;
       else if (userType.equals("2") & Machine.waterA >= Latte.WATER &
                Machine.cbeansA >= Latte.CBEANS & Machine.milkA >= Latte.MILK & Machine.cupsA > 0) return true;
           else if (userType.equals("3") & Machine.waterA >= Cappuccino.WATER &
                Machine.cbeansA >= Cappuccino.CBEANS & Machine.milkA >= Cappuccino.MILK & Machine.cupsA > 0) return true;

            return false;
    }

    private void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        waterA += sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milkA += sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        cbeansA += sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cupsA += sc.nextInt();
    }
    private void take(){
        System.out.println("Money: $" + money +"\nI gave you $" +  money);
        setMoney(0);
        System.out.println("Money: $" + money);
    }


    private void setMoney(int money) {
        this.money = money;
    }
}

