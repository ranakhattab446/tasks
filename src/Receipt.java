public class Receipt {
    private Order order;

    public Receipt(Order order) {
        this.order = order;
    }

    public void printReceipt() {
        System.out.println(order);
        System.out.println("Total: " + order.getTotalPrice());
    }
}
