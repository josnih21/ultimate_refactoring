package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int price;
    private final List<Integer> prices = new ArrayList<>();

    public void add(int price) {
        this.price = price;
        prices.add(price);
    }

    public int calculateTotalPrice() {
        return prices.stream().mapToInt(Integer::intValue).sum();
    }

    public boolean hasDiscount() {
        return price >= 100;
    }

    public int numberOfProducts() {
        return 1;
    }
}
