import java.util.ArrayList;
import java.util.List;

public class WishList {
    private final List<Product> products;   // list of products
    private final String id;                // client id

    public WishList(String clientID) {
        this.id = clientID;
        this.products = new ArrayList<>();
    }

    /**
     * Add a product to the wishlist. If a product with the same productId exists,
     * its quantity is increased by  product's quantity.
     */
    public String addProduct(Product p) {
        if (p == null) return "Invalid product";

        for (int i = 0; i < products.size(); i++) {
            Product existing = products.get(i);
            if (existing != null && existing.getProductId().equals(p.getProductId())) {
                existing.addQuantity(p.getQuantity()); // increment existing quantity
                return "Product quantity has been updated";
            }
        }

        products.add(p);
        return "Product added";
    }

    /** Returns a copy of the products list */
    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    /** True if a product with the same productId exists */
    public boolean hasProduct(Product p) {
        if (p == null) return false;
        String pid = p.getProductId();
        for (int i = 0; i < products.size(); i++) {
            Product cur = products.get(i);
            if (cur != null && cur.getProductId().equals(pid)) {
                return true;
            }
        }
        return false;
    }

    public String getClientId() {
        return id;
    }

    @Override
    public String toString() {
        return "WishList{clientId='" + id + "', products=" + products + "}";
    }
}
