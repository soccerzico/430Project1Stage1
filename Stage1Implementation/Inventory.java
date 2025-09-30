import java.util.*;
import java.lang.*;
import java.io.*;


import java.util.*;

public class Inventory {
  private final List<Product> products = new LinkedList<>();
  private static Inventory inventory;

  private Inventory() {}

  public static Inventory instance() {
    if (inventory == null) {
      inventory = new Inventory();
    }
    return inventory;
  }

  public boolean addProduct(Product product) {
    return products.add(product);
  }

  public boolean removeProduct(Product product) {
    return products.remove(product);
  }

  public Iterator<Product> getProducts() {
    return products.iterator();
  }

  @Override
  public String toString() {
    return products.toString();
  }
  public void displayInventory() {
    System.out.println("=== Inventory ===");
    int totalQuantity = 0;

    for (Product p : products) {
        System.out.println(p); // relies on Product.toString()
        totalQuantity += p.getQuantity();
    }

    System.out.println("----------------");
    System.out.println("Total distinct products: " + products.size());
    System.out.println("Total items in stock: " + totalQuantity);
}


  public boolean checkInventory(Iterator<Product> iter, Product target) {
    if (iter == null || target == null) return false;
    while (iter.hasNext()) {
      Product p = iter.next();
      if (target.equals(p)) {       // relies on Product.equals
        return true;
      }
    }
    return false;
  }
}

