public class sodas {
    String name;
    boolean fizzy;
    String colour;


    public sodas(String theName, boolean isFizzy, String inColour) {
        name = theName;
        fizzy = isFizzy;
        colour = inColour;
    }



    public String open() {
        return "*pop!";
    }


}


