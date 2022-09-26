package Video_32_33_34_Encapsulation;

public class Product {
    private int productId;
    private String productName;
    private String description;
    private double productPrice;
    private int productStockAmount;
    private String productColor;
    private String productCode;


    public Product(int productId, String productName, String description, double productPrice,
                   int productStockAmount, String productColor) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.productPrice = productPrice;
        this.productStockAmount = productStockAmount;
        this.productColor = productColor;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStockAmount() {
        return productStockAmount;
    }

    public void setProductStockAmount(int productStockAmount) {
        this.productStockAmount = productStockAmount;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCode() {
        return this.productName.substring(0, 1) + productId;
    }


}
