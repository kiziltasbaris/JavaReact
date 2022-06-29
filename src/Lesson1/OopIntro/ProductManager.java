package Lesson1.OopIntro;

import Lesson1.OopIntro.Product;

public class ProductManager {

    public void addToCart(Product product){
        System.out.println("Added to Cart :" + product.getName());
    }
}
