import java.util.ArrayList;
import java.util.Scanner;

public class convStore {

    Scanner input = new Scanner(System.in);

    public int numSodas = 0;
    int numChips;
    int numBread;

    int numColas = 0;
    int numSprites = 0;


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

    public void buy(products product, int amtToBuy) {
        //add user-pc dialogue here

        /*
        if (product.name.equalsIgnoreCase("Cola") && numColas > amtToBuy) {
            //Above If statement authorizes the purchase

            productsInStore.removeAll(sodasInCart);


            numSodas -= amtToBuy;
            numColas -= amtToBuy;

        } else {
            System.out.println("The item you have chosen is unavailable, or does not have sufficient stock left.");
            //add showing stock function
        }

         */

        productsInStore.removeAll(product.purchaseAProduct(product, amtToBuy, productsInStore));

    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        products mainCola = new Cola();
        products mainSprite = new Sprite();

        convStore HappyShop = new convStore();
        HappyShop.restock(5, mainCola);
        System.out.println(HappyShop.productsInStore);
        System.out.printf("The shop has: %d sodas%n", HappyShop.numSodas);

        HappyShop.restock(5, mainSprite);
        System.out.println(HappyShop.productsInStore);
        System.out.printf("The shop has: %d sodas%n", HappyShop.numSodas);

        System.out.println("What would you like to buy?");
        String itemChoice = userInput.next();
        System.out.println("How many?");
        int itemAmount = userInput.nextInt();

        HappyShop.buy(mainSprite, itemAmount);

        System.out.println(HappyShop.productsInStore);
        System.out.printf("The shop has: %d sodas%n", HappyShop.numSodas);

    }

}
