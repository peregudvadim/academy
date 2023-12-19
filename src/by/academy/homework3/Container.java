package by.academy.homework3;

public class Container {

    private Product[] products;
    private int current;

    public Product[] getProducts() {
        return products;
    }

    public void delete(int index) {
        if (index < 0 || index >= current) {
            System.out.println("Введите правильный индекс");
            return;
        }
        if (index != products.length - 1) {
            System.arraycopy(products, index + 1, products, index, products.length - index - 1);
        }
        products[current-- - 1] = null;
    }

    private void grow() {
        Product[] newProducts = new Product[products.length * 2 + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        products = newProducts;
    }

    public void add(Product product) {
        if (products == null) {
            products = new Product[10];
            current = 0;
        }

        if (current >= products.length) {
            grow();
        }

        products[current++] = product;
    }

    public void printProducts() {
        for (int i = 0; i < current; i++) {
            System.out.println((i + 1) + " - " + products[i]);
        }
    }
}

