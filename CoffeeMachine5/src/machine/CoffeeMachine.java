package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Machine machine = new Machine();
        machine.run();

    }
}
       /*Scanner sc = new Scanner(System.in);

        final int WATER = 200;
        final int MILK = 50;
        final int CBEANS = 15;

        System.out.println("Write how many ml of water machine has: ");
        int waterA = sc.nextInt();;
        System.out.println("Write how many ml of milk machine has: ");
        int milkA = sc.nextInt();;
        System.out.println("Write how many grams of coffee beans machine has: ");
        int cbeansA = sc.nextInt();;
        System.out.println("Write how many cups of coffee you will need: ");
        int amount = sc.nextInt();;


        float cW = waterA / WATER;
        float cM = milkA / MILK;
        float cB = cbeansA / CBEANS;

        float [] arr = new float [] {cW, cM, cB};
        boolean flag = true;
        while (flag){
            flag = false;
            float temp;
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i + 1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
        }


        if (cW >= amount && cM >= amount && cB >= amount){
            if ((cW - amount) >= 1 && (cM - amount) >= 1 && (cB - amount) >= 1){
                System.out.println(
                "Yes, I can make that amount of coffee (and even  " + (arr[0] - amount) +
                                "  more than that)");
            }
            else System.out.println("Yes, I can make that amount of coffee");
        }
        else if (waterA >= WATER && milkA >= MILK && cbeansA >= CBEANS){
            System.out.println("No, I can make only " + arr[0] + " cup(s) of coffee");
        }
        else System.out.println("No, I can't do any cup");

    }
}*/






  /* System.out.println("Write how many cups of coffee you will need: ");
        System.out.println("For " + amount + " cups of coffee you will need:");
        System.out.println(amount * WATER + " ml of water");
        System.out.println(amount * MILK + " ml of milk");
        System.out.println(amount * CBEANS + " g of coffee beans");*/