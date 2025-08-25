package Bai2;

import java.util.ArrayList;

public class ProductServiceImpl implements ProductService {
    ArrayList<Product> products = new ArrayList<Product>();

    public ProductServiceImpl(ArrayList<Product> products) {
        this.products = products;
    }

    public ProductServiceImpl() {
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public void addProduct(Product p) {

    }

    @Override
    public void updateProduct(Product p) {

    }

    @Override
    public void deleteProduct(String id) {

    }

    @Override
    public Product findByName(String name) {
        return null;
    }

    @Override
    public void sortByPriceAsc() {

    }

    @Override
    public void sortByPriceDesc() {

    }

    @Override
    public void printProducts() {
        System.out.printf("%-6s | %-20s | %-20s | %-25s | %-8s | %-15s | %-15s \n",
                "ID", "Name", "Category", "Manufacturer (name)", "Quantity", "Price", "Discount Price");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for (Product p : products) {
            System.out.println("%-6s | %-20s | %-20s | %-25s | %-8s | %-5d | %-5.2f \n",
                    p.getId(), p.getName(), p.getCategory(), p.getManufacturer().getName(), p.getQuantity(), p.getPrice(), p.getDiscountPrice());
        }
    }
}
