package org.samsung;

import java.util.Scanner;

public class CustomerApp {
    private static CustomerService customerService = new CustomerService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Create Customer");
            System.out.println("2. View All Customers");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    createCustomer(scanner);
                    break;
                case 2:
                    viewCustomers();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void createCustomer(Scanner scanner) {
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Customer Number: ");
        String number = scanner.nextLine();
        System.out.print("Enter Customer Email: ");
        String email = scanner.nextLine();

        customerService.addCustomer(name, number, email);
    }

    private static void viewCustomers() {
        System.out.println("All Customers:");
        for (Customer customer : customerService.getCustomers()) {
            System.out.println(customer);
        }
    }
}
