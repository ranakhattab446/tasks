import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<String> items;
    private List<Additions> additions;

    public Menu() {
        items = new ArrayList<String>();
        items.add("1-Beef Burger");
        items.add("2-Chicken Burger");
        items.add("3-cheese Burger");
        additions = new ArrayList<Additions>();

    }

    public static void main(String[] args) {

    }

    public void addMenuItem(String item) {
        items.add(item);
    }

    public void addAddition(Additions addition) {
        additions.add(addition);
    }

    public List<String> getItems() {
        return items;
    }

    public List<Additions> getAdditions() {
        return additions;
    }

    
}
