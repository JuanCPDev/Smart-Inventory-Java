import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static List<Product> productList = new ArrayList<>();
    public static void showProducts() {

        if(productList.size()==0){
            System.out.println("\n\nNo products exist.\nReturning to main menu.\n\n");
        }
        for (Product product : productList) {
            System.out.println("\n\n" + product.getName());
            System.out.println("Cost $" + product.getPrice());

        }

    }

    public static void addProduct(String name, double price) {


        Product item = new Product();
        item.setName(name);
        item.setPrice(price);

        productList.add(item);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean con = true;
        String title = "Smart Inventory";
        int option;
        List<String> options = new ArrayList<>();
        options.add("1-Show products");
        options.add("2-add product");
        //options.add("3-Show materials");
        //options.add("4-add material");
        options.add("5-to exit");

        while (con) {
            System.out.println("\t\t\t" + title);
            System.out.println("\t     Welcome to your inventory management.\n");
            System.out.println("Please select an option and press enter.");
            for (String s : options) {
                System.out.println(s);
            }
            option = scnr.nextInt();

            switch (option) {
                case 1 -> showProducts();
                case 2 -> {
                    String name;
                    double price;
                    System.out.println("Please enter name then press enter.");
                    name = scnr.next();
                    System.out.println("Please enter price then press enter");
                    price = scnr.nextDouble();
                    addProduct(name, price);
                }
                case 5 -> {
                    System.out.println("Good bye");
                    con = false;
                }
            }
        }

    }

}
