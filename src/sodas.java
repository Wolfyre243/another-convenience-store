import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class sodas extends products{
    String name;
    boolean fizzy;
    String colour;



    public sodas(String theName, boolean isFizzy, String inColour) {
        super("soda", theName);
        name = theName;
        fizzy = isFizzy;
        colour = inColour;
    }








    public String open() {
        return "*pop!";
    }


}


