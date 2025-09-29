public class product {

    private String productID;
    private String Name;
    private int quantity;
    private double price;

    public product(String productID, String Name, int quantity, double price){

        this.productID = productID;
        this.Name = Name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getInfo(){
        return "Product: "+ Name + "\n" + "Product ID: " + productID + "\n" + "quantity: "+ quantity + "\n" + "Price: " + price;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return Name;
    }

    public void addStock(int amount){
        quantity += amount;
        System.out.println("Product " + Name + " has been restocked");
    }

    public void removeStock(int amount){
        quantity -= amount;
        System.out.println("Product " + Name + " stock has been reduced");
    }

    public void setPrice(double newPrice){
        price = newPrice;
        System.out.println("Product " + Name + " has changed in price");
    }
}