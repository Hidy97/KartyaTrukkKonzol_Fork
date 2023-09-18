package kartyatrukkkonzolon;

public class Lap {
    private String leiras;
    /*
    private String[] szinek; //= {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
    private String[] ertekek; //= {"P", "T", "Z", "M"};*/

    public Lap(String leiras) {
        this.leiras = leiras;
        /*this.szinek = szinek;
        this.ertekek = ertekek;*/
    }

    public String getLeiras() {
        return leiras;
    }
    
}
