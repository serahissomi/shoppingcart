import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {
        Set<Product> productSet = new HashSet<>();

        productSet.add(new Product("fruit", "사과", 2000));
        productSet.add(new Product("dairy", "우유", 2300));
        productSet.add(new Product("dairy", "우유", 2300));
        productSet.add(new Product("dairy", "계란", 5000));

        Product apple = new Product("fruit", "사과", 2000);
        Product milk1 = new Product("dairy", "우유", 2300);
        Product milk2 = new Product("dairy", "우유", 2300);
        Product egg = new Product("dairy", "계란", 5000);


        System.out.println("고유한 상품 목록: ");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice());
        }

        Cart myCart = new Cart();

        myCart.addProduct(apple, 3);
        myCart.addProduct(milk1, 2);
        myCart.addProduct(milk2, 3);
        myCart.addProduct(egg, 1);


        myCart.removeProduct(milk1, 1);
        myCart.removeProduct(apple, 2);
        System.out.println();

        myCart.showItems();

    }
}