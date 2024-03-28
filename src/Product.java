import java.util.Objects;

public class Product {
    private String productKey;
    private String productName;
    private int price;

    public Product (String productKey, String name, int price) {
        this.productKey = productKey;
        this.productName = name;
        this.price = price;
    }

    public String getProductKey() {
        return this.productKey;
    }

    public String getName() {
        return this.productName;
    }

    public int getPrice() {
        return this.price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productKey == product.productKey &&
                Integer.compare(product.price, price) == 0 &&
                Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productKey, productName, price);
    }

    @Override
    public String toString() {
        return productName;
    }
}
