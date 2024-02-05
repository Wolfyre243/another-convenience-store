import java.util.ArrayList;
import java.util.Scanner;

public class convStore {

    Scanner input = new Scanner(System.in);

    public int numSodas;
    int numChips;
    int numBread;

    ArrayList<sodas> sodaArr = new ArrayList<sodas>();
    ArrayList<sodas> sodasInCart = new ArrayList<sodas>();

    public convStore() {


    }

    public void restockSoda(int restockAmt, sodas sodaType) {
        numSodas += restockAmt;
        for (int i = 0; i < restockAmt; i++ ) {
            sodaArr.add(sodaType);
        }
    }

    public void buy(String item, int amtToBuy) {
        if (item.equalsIgnoreCase("soda") && numSodas > amtToBuy) {

            System.out.println("What type of soda would you want?");
            // insert user input code here
            String answer = input.next();
            if (answer.equalsIgnoreCase("Cola")) {
                int bought = 0;
                for (sodas soda : sodaArr) {
                    if (soda.name.equalsIgnoreCase("Cola") && bought < amtToBuy) {
                        bought += 1;
                        sodasInCart.add(soda);
                        System.out.println("The current soda stock: " + sodaArr);
                        System.out.println(sodasInCart);


                    }
                }

                sodaArr.removeAll(sodasInCart);
            }

            numSodas -= amtToBuy;
        }
    }

    public static void main(String[] args) {



        sodas Cola = new Cola();
        sodas Sprite = new Sprite();

        convStore HappyShop = new convStore();
        HappyShop.restockSoda(5, Cola);
        System.out.println(HappyShop.sodaArr);
        System.out.println("The shop has: " + HappyShop.numSodas + " sodas");

        HappyShop.buy("soda", 3);

        System.out.println(HappyShop.sodaArr);
        System.out.println("The shop has: " + HappyShop.numSodas + " sodas");

    }

}
