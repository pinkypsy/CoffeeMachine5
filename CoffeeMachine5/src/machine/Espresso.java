package machine;

class Espresso extends Drink {


    static final int WATER = 250;
    static final int CBEANS = 16;
    private static final int PRICE = 4;

    Espresso() {
        Machine.waterA -= WATER;
        Machine.cbeansA -= CBEANS;
        Machine.money += PRICE;
        Machine.cupsA--;
        System.out.println("Your Espresso is ready");
    }


}
