package Bai2;

public class ClothingProduct extends Product {
    @Override
    double getDiscountPrice() {
        return super.getPrice() * (1 - 0.2);
    }
}
