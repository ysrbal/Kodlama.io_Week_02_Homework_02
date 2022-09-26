package Video_31_ClassesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.id = 1;
        p1.productName = "Laptop";
        p1.description = "Asus Laptop";
        p1.productPrice = 5000;
        p1.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(p1);
        System.out.println();
        System.out.println("#########################");
        System.out.println(p1.id);
        System.out.println(p1.productName);
        System.out.println(p1.description);
        System.out.println(p1.productPrice);
        System.out.println(p1.stockAmount);
        System.out.println("#########################");
    }
}
