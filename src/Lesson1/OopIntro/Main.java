package Lesson1.OopIntro;

public class Main {

    public static void main(String[] args) {

        Product product1= new Product(1,"Lenovo V14",1000,"16 GB RAM",10,13500);

        Product product2= new Product();
        product2.setId(2);
        product2.setName("Samsung");
        product2.setUnitPrice(1000);
        product2.setDetail("8GB RAM");

        System.out.println(product2.getUnitPriceAfterDiscount());

        Product product3= new Product();
        product3.setId(3);
        product3.setName("ASUS TUF");
        product3.setUnitPrice(500);
        product3.setDetail("32 gb ram");

        Product [] products = { product1, product2, product3 };

        for ( Product product: products ) {
            System.out.println( product.getName() );
        }


        Category category1 = new Category();
        category1.setId(1);
        category1.setName("Computer");

        Category category2 = new Category();
        category2.setId(2);
        category2.setName("House/Garden");




      ProductManager productManager = new ProductManager();
      productManager.addToCart(product1);
      productManager.addToCart(product2);
      productManager.addToCart(product3);
    }
}
