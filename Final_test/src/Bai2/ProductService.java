package Bai2;

public interface ProductService {
    void addProduct(Product p);

    void updateProduct(Product p);

    void deleteProduct(String id);

    Product findByName(String name);

    void sortByPriceAsc();

    void sortByPriceDesc();

    void printProducts();
}
