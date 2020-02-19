package machine;

class Cappuccino extends Drink {

    static final int WATER = 200;
    static final int MILK = 100;
    static final int CBEANS = 12;
    private static final int PRICE = 6;

    Cappuccino() {

        Machine.waterA -= WATER;
        Machine.milkA -= MILK;
        Machine.cbeansA -= CBEANS;
        Machine.money += PRICE;
        Machine.cupsA--;
        System.out.println("Your Cappuccino is ready");
    }

}

