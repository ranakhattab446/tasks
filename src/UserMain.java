import java.util.Scanner;

public class UserMain {
    private Menu menu;

    public UserMain(Menu menu) {
        this.menu = menu;
    }

    public void showMainMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to our restaurant");
            menu.showMenu();
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();
            String selectedItem = menu.getItems().get(choice - 1);

            Order order = new Order(selectedItem);

            System.out.print("Do you like to add any additions? (1-Yes, 2-No): ");
            int addChoice = scanner.nextInt();

            if (addChoice == 1) {
                menu.showAdditions();
                System.out.print("Please select options (like 1, 2): ");
                scanner.nextLine(); // consume newline
                String[] additions = scanner.nextLine().split(",");
                for (String addition : additions) {
                    int addIndex = Integer.parseInt(addition.trim()) - 1;
                    order.addAddition(menu.getAdditions().get(addIndex));
                }
            }

            System.out.println("Your order is:");
            System.out.println(order);
            System.out.print("1- Confirm\n2- Back to Menu\nPlease select an option: ");
            int confirmChoice = scanner.nextInt();

            if (confirmChoice == 1) {
                Receipt receipt = new Receipt(order);
                receipt.printReceipt();
                break;
            }
        }

        scanner.close();
    }
}
