package Bai2;

public class ElectronicProduct extends Product {

    @Override
    double getDiscountPrice() {
        return super.getPrice() * (1 - 0.1);
    }
}
