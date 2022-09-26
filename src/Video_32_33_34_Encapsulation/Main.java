package Video_32_33_34_Encapsulation;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Black");

        Product product1 = new Product();
        product1.setProductId(2);
        product1.setProductName("MobilePhone");
        product1.setDescription("Iphone");
        product1.setProductPrice(1400);
        product1.setProductStockAmount(5);
        product1.setProductColor("Rose Gold");

        System.out.println(product.getProductCode());
        System.out.println(product.getProductId());
        System.out.println(product.getProductName());
        System.out.println(product.getDescription());
        System.out.println(product.getProductPrice());
        System.out.println(product.getProductStockAmount());
        System.out.println(product.getProductColor());

        System.out.println("#########################");

        System.out.println(product1.getProductCode());
        System.out.println(product1.getProductId());
        System.out.println(product1.getProductName());
        System.out.println(product1.getDescription());
        System.out.println(product1.getProductPrice());
        System.out.println(product1.getProductStockAmount());
        System.out.println(product1.getProductColor());

    }
}
