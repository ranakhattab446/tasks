import java.util.Scanner;

public class AdminMain {
    private Menu menu;

    public AdminMain(Menu menu) {
        this.menu = menu;
    }

    public void showAdminMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1- View Menu");
            System.out.println("2- View Additions");
            System.out.println("3- Add New Item to Menu");
            System.out.println("4- Add New Addition");
            System.out.print("Please select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    menu.showMenu();
                    break;
                case 2:
                    menu.showAdditions();
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    scanner.nextLine(); // consume newline
                    String itemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double itemPrice = scanner.nextDouble();
                    menu.addMenuItem(String.valueOf(new MenuItems(itemName, itemPrice)));
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    scanner.nextLine(); // consume newline
                    String additionName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double additionPrice = scanner.nextDouble();
                    menu.addAddition(new Additions(additionName, additionPrice));
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }

       // scanner.close();
    }
}
