import java.util.Objects;

public class Product {
    private String productID;
    private String name;
    private int quantity;
    private double price;

    public Product(String productID, String name, int quantity, double price){

        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product that = (Product) o;
        return Objects.equals(this.productID, that.productID);
    }
    @Override
    public String toString() {
        return "Product{id='" + productID + "', name='" + name + 
            "', qty=" + quantity + ", price=" + price + "}";
    }

    public int getQuantity(){
        return quantity;
    }

    public String getInfo(){
        return "Product: "+ name + "\n" + "Product ID: " + productID + "\n" + "quantity: "+ quantity + "\n" + "Price: " + price;
    }

    public String getProductId(){
        return productID;
    }

    public double getPrice(){
        return price;
    }

    public String getname(){
        return name;
    }

    public void addQuantity(int amount){
        quantity += amount;
        //print statment for testing purposes
        System.out.println("Product " + name + "'s Quantity has been increased");
    }

    public void removeQuantity(int amount){
        quantity -= amount;
        //print statment for testing purposes
        System.out.println("Product " + name + "'s  Quantity has been decreased");
    }

    public void setPrice(double newPrice){
        price = newPrice;
        //print statment for testing purposes
        System.out.println("Product " + name + " has changed in price");
    }
}