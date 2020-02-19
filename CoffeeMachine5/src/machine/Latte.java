package machine;

class Latte extends Drink {
    static final int WATER = 350;
    static final int MILK = 75;
    static final int CBEANS = 20;
    private static final int PRICE = 7;

    Latte() {

        Machine.waterA -= WATER;
        Machine.milkA -= MILK;
        Machine.cbeansA -= CBEANS;
        Machine.money += PRICE;
        Machine.cupsA--;
        System.out.println("Your Latte is ready");

    }

}

