import java.util.ArrayList;

public class products {
    String productType;
    String name;

    ArrayList<products> productsInStore = new ArrayList<>();

    public products(String inputProdType, String inputName) {
        productType = inputProdType;
        name = inputName;
    }

    public ArrayList<sodas> restockSoda(int restockAmt, String sodaType) {
        //numSodas += restockAmt;
        ArrayList<sodas> sodasToRestock = new ArrayList<>();
        if (sodaType.equalsIgnoreCase("Cola")) {
            for (int i = 0; i < restockAmt; i++ ) {
                sodas colaToAdd = new Cola();

                sodasToRestock.add(colaToAdd);

            }
        } else if (sodaType.equalsIgnoreCase("Sprite")) {
            for (int i = 0; i < restockAmt; i++ ) {
                sodas spriteToAdd = new Sprite();

                sodasToRestock.add(spriteToAdd);
            }
        }

        return sodasToRestock;
    }


    public ArrayList<products> purchaseAProduct(products product, int amountToBuy, ArrayList<products> currentStock) {

        ArrayList<products> itemsToBuy = new ArrayList<>();

        int bought = 0;
        for (products productToBuy : currentStock) {
            if (productToBuy.name.equalsIgnoreCase(product.name) && bought < amountToBuy) {
                bought += 1;
                itemsToBuy.add(productToBuy);

            }
        }

        return itemsToBuy;
    }

}
