package implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Price> prices2 = new ArrayList<>();

    public void add(Price price1) {
        prices2.add(price1);
    }

    public Price calculateTotalPrice() {
        return new Price(prices2.stream().mapToInt(Price::getPrice).sum());
    }

    public boolean hasDiscount() {
        return calculateTotalPrice().getPrice() >= 100;
    }

    public int numberOfProducts() {
        return prices2.size();
    }
}
