import java.lang.reflect.Array;
import java.util.ArrayList;

public class sodas extends products{
    String name;
    boolean fizzy;
    String colour;

    int numColas = 0;
    int numSprites = 0;

    public sodas(String theName, boolean isFizzy, String inColour) {
        super("soda", theName);
        name = theName;
        fizzy = isFizzy;
        colour = inColour;
    }

    /*
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
    */




    public String open() {
        return "*pop!";
    }


}


