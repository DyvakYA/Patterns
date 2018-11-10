package creational.builder.builder1;

/**
 * Created by User on 5/27/2018.
 */
public class Product {

    private String name;
    private String description;

    private Product(String name, String description){
        this.name = name;
        this.description = description;
    }

    public static ProductBuilder builder(){
        return new ProductBuilder();
    }

    public static class ProductBuilder {

        private String name;
        private String description;

        private ProductBuilder() {}

        public ProductBuilder name(String name){
            this.name = name;
            return this;
        }

        public ProductBuilder description(String description){
            this.description = description;
            return this;
        }

        public Product build(){
            return new Product(name, description);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
