import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void showProducts(List<Product> productList) {

        if(productList.size()==0){
            System.out.println("\n\nNo products exist.\nReturning to main menu.1\n\n");
        }
        for (int index = 0; index < productList.size(); index++) {
            System.out.println("\n\n"+productList.get(index).getName());
            System.out.println("Cost $" + productList.get(index).getPrice());

        }

    }

    public static void addProduct(List<Product> productList, Scanner scnr) {
        String name;
        double price;
        System.out.println("Please enter name then press enter.");
        name = scnr.next();
        System.out.println("Please enter price then press enter");
        price = scnr.nextDouble();
        

        Product item = new Product();
        item.setName(name);
        item.setPrice(price);

        productList.add(item);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Boolean con = true;
        String title = "Smart Inventory";
        int option = 0;
        List<String> options = new ArrayList<String>();
        options.add("1-Show products");
        options.add("2-add product");
        options.add("3-Show materials");
        options.add("4-add material");
        options.add("5-to exit");
        List<Product> productList = new ArrayList<Product>();

        while (con) {
            System.out.println("\t\t\t" + title);
            System.out.println("\t     Welcome to your inventory management.\n");
            System.out.println("Please select an option and press enter.");
            for (int index = 0; index < options.size(); index++) {
                System.out.println(options.get(index));
            }
            option = scnr.nextInt();

            switch (option) {
                case 1:
                    showProducts(productList);
                    break;
                case 2:
                    addProduct(productList, scnr);
                    break;
                case 5:
                System.out.println("Good bye");
                con=false;
                break;
            }
        }

    }

}
