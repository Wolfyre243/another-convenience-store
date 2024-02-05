import java.util.ArrayList;
import java.util.Scanner;

public class convStore {

    Scanner input = new Scanner(System.in);

    public int numSodas;
    int numChips;
    int numBread;


    //sodas mainCola = new Cola();
    //sodas mainSprite = new Sprite();

    ArrayList<sodas> sodaArr = new ArrayList<sodas>();
    ArrayList<sodas> sodasInCart = new ArrayList<sodas>();

    ArrayList<products> productsInStore = new ArrayList<>();

    public convStore() {


    }

    public void restock(int restockAmt, products productPlaceholder) {
        //System.out.println("What would you like to restock?");
        //String restockItem = input.next();
        if (productPlaceholder.productType.equalsIgnoreCase("soda")) {
            productsInStore.addAll(productPlaceholder.restockSoda(5, productPlaceholder.name));
            //productsInStore.addAll(sodaArr);
            numSodas += restockAmt;
        }

    }

    public void buy(String item, int amtToBuy) {
        if (item.equalsIgnoreCase("soda") && numSodas > amtToBuy) {

            System.out.println("What type of soda would you want? We have cola and sprite!");
            // insert user input code here
            String answer = input.next();
            if (answer.equalsIgnoreCase("Cola")) {
                int bought = 0;
                for (sodas soda : sodaArr) {
                    if (soda.name.equalsIgnoreCase("Cola") && bought < amtToBuy) {
                        bought += 1;
                        sodasInCart.add(soda);



                    }
                }

                sodaArr.removeAll(sodasInCart);
            }

            numSodas -= amtToBuy;
        } else {
            System.out.println("The item you have chosen is unavailable, or does not have sufficient stock left.");
            //add showing stock function
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        products mainCola = new Cola();
        products mainSprite = new Sprite();

        convStore HappyShop = new convStore();
        HappyShop.restock(5, mainCola);
        System.out.println(HappyShop.productsInStore);
        System.out.println("The shop has: " + HappyShop.numSodas + " sodas");

        HappyShop.restock(5, mainSprite);
        System.out.println(HappyShop.productsInStore);
        System.out.println("The shop has: " + HappyShop.numSodas + " sodas");

        System.out.println("What would you like to buy?");
        String itemChoice = userInput.next();
        System.out.println("How many?");
        int itemAmount = userInput.nextInt();

        HappyShop.buy(itemChoice, itemAmount);

        System.out.println(HappyShop.sodaArr);
        System.out.println("The shop has: " + HappyShop.numSodas + " sodas");

        System.out.println("This will appear to test offline compatibility");

    }

}
