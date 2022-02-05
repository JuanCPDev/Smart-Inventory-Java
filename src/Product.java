public class Product {
    private String name;
    private double price;
    private String material1;
    private double material1Use;

    Product(String name, double price, String material1, double material1Use) {
        this.name = name;
        this.price = price;
        this.material1 = material1;
        this.material1Use = material1Use;
    }

    Product() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial1() {
        return material1;
    }

    public void setMaterial1(String material1) {
        this.material1 = material1;
    }

    public double getMaterial1Use() {
        return material1Use;
    }

    public void setMaterial1Use(double material1Use) {
        this.material1Use = material1Use;
    }

} 