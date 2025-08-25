package Bai2;

public class FoodProduct extends Product {
    @Override
    double getDiscountPrice() {
        return super.getPrice() * (1 - 0.05);
    }
}
