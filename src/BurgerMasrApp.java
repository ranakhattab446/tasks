import java.util.Scanner;

    public static void main(String[] args) {
        Menu menu = new Menu();
        UserMain userMain = new UserMain(menu);
        AdminMain adminMain = new AdminMain(menu);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to our resturant ");
            System.out.println("1- User Mode");
            System.out.println("2- Admin Mode");
            System.out.print("Please select a mode: ");
            int selected = scanner.nextInt();

            switch (selected) {
                case 1:
                    userMain.showMainMenu();
                    break;
                case 2:
                    adminMain.showAdminMenu();
                    break;
                default:
                    System.out.println("Invalid mode, please try again.");
            }
        }
    }
}
