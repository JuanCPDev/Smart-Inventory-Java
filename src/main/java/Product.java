public class Product {
    private String name;
    private double price;
    private String material;
    private double materialUse;

    Product(String name, double price, String material, double materialUse) {
        this.name = name;
        this.price = price;
        this.material = material;
        this.materialUse = materialUse;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material1) {
        this.material = material1;
    }

    public double getMaterialUse() {
        return materialUse;
    }

    public void setMaterialUse(double materialUse) {
        this.materialUse = materialUse;
    }

} 