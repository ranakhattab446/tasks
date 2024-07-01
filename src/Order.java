import java.util.ArrayList;
import java.util.List;

public class Order {
    private MenuItems item;
    private List<Additions> additions;

    public Order(String item) {
        this.item = item;
        this.additions = new ArrayList<>();
    }

    public void addAddition(Additions addition) {
        additions.add(addition);
    }

    public double getTotalPrice() {
        double total = item.getPrice();
        for (Additions addition : additions) {
            total += addition.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Order: " + item.getName() + "\nAdditions: ");
        for (Additions addition : additions) {
            orderDetails.append(addition.getName()).append(", ");
        }
        return orderDetails.toString();
    }
}
