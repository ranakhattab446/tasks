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
            
            System.out.print("Please select one: ");
            int selected = scanner.nextInt();
            String selectedItem = menu.getItems().get(selected );

            Order order = new Order(selectedItem);

            System.out.print("Do you like to add any additions? (1-Yes, 2-No): ");
            int options = scanner.nextInt();

            if (options == 1) {
            
                System.out.print("Please select option  1 or 2: ");
                scanner.nextLine();
                String[] additions = scanner.nextLine()
                for (String addition : additions) {
                    

            System.out.println("Your order is:");
            System.out.println(order);
            System.out.print("1- Confirm \n2- Back to Menu \nPlease select an option: ");
            

            
    }
}
