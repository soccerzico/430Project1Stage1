public class MainClass{
    public static void main(String[] args){

        product product1 = new product("1ABC", "Bananas", 7, 0.35);
        System.out.println(product1.getInfo());
        product1.addStock(7);
        System.out.println(product1.getName() + "quanity: " + product1.getQuantity());
        product1.setPrice(0.45);
        System.out.println(product1.getName() + " price: " + product1.getPrice());

    }

}