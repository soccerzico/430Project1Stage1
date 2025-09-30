import java.util.*;
import java.lang.*;
import java.io.*;

public class Inventory {
  private List products = new LinkedList();
  private static Inventory inventory;

  private Inventory() {
  }
  public static Inventory instance() {
    if (inventory == null) {
      return (inventory = new Inventory());
    } else {
      return inventory;
    }
  }
  
  //Add and remove products from inventory's collection
  public boolean AddProduct(Product product) {
    products.add(product);
    return true;
  }

  public boolean RemoveProduct(Product product) {
    products.remove(product);
    return true;
  }

  //Use to traverse the inventory's collection.
  public Iterator GetProducts() {
    return products.iterator();
  }
 
  public String toString() {
    return products.toString();
  }
  
  //Check if product is in inventory.
  public boolean CheckInventory(Iterator GetProducts, Product product){
    while (products.hasNext()){
        if (products.next() == product){
            return true;
        }
     }
    return false;
  }
}
