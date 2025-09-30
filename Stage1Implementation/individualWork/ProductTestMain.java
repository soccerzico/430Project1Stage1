public class ProductTestMain {
    public static void main(String[] args) {
        Product p1 = new Product("P100", "Notebook", 2, 2.99);
        Product p2 = new Product("P200", "Pen", 5, 0.85);

        System.out.println(p1);
        System.out.println(p1.getInfo());
        System.out.println(p2);
        System.out.println(p2.getInfo());

        p1.addQuantity(3);
        System.out.println(p1.getname() + " quantity: " + p1.getQuantity());

        p1.removeQuantity(1);
        System.out.println(p1.getname() + " quantity: " + p1.getQuantity());

        p1.setPrice(3.49);
        System.out.println(p1.getname() + " price: " + p1.getPrice());

        Product p1Duplicate = new Product("P100", "Notebook", 2, 2.99);
        System.out.println("p1.equals(p1Duplicate): " + p1.equals(p1Duplicate));
        System.out.println("p1.equals(p2): " + p1.equals(p2));
    }
}
