package programmer.zaman.now.application;

import programmer.zaman.now.data.*;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("mac book pro", 300000);
        System.out.println(product.name);
        System.out.println(product.price);

        Data data = new Data();
    }
}
