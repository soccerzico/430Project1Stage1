import java.util.ArrayList;
import java.util.List;

public class MainTesterClass{
    public static void main(String[] args){
        Inventory WarehouseInventory = Inventory.instance();
        ClientList list = new ClientList();
        WishList wl = new WishList("C001");
        WishList wl2 = new WishList("C002");
        WishList wl3 = new WishList("C003");
        List<WishList> wishListList = new ArrayList<>();
        wishListList.add(wl);
        wishListList.add(wl2);
        wishListList.add(wl3);
        Product p1 = new Product("P100", "Notebook", 2, 2.99);
        Product p2 = new Product("P200", "Pen", 5, 0.85);
        Product p3 = new Product("P300", "Stapler", 3, 4.99);
        WarehouseInventory.addProduct(p1);
        WarehouseInventory.addProduct(p2);
        WarehouseInventory.addProduct(p3);
        wl.addProduct(p1);
        wl2.addProduct(p2);
        wl3.addProduct(p3);
        list.addClient(new Client("C001", "Mike Johnson", "123 Maple St"));
        list.addClient(new Client("C002", "Kanye West", "456 Oak St"));
        list.addClient(new Client("C003", "King Von", "789 Pine St"));

        //Query 1 : display all products in inventory
        WarehouseInventory.displayInventory();
        System.out.println("\n");

        //Query 2: display all clients on record 
        list.displayAllClients();
        System.out.println("\n");

        //Query 3: display wishlist for each client on record
        list.displayWishLists(wishListList);
}
}
