import product.FoodProduct;
import product.FoodType;
import product.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Product> products = List.of(
                new FoodProduct("apple", 1, 0.5, 10, FoodType.FRUIT),
                new FoodProduct("pear", 1, 0.5, 10, FoodType.FRUIT),
                new FoodProduct("kiwi", 1, 0.5, 10, FoodType.FRUIT),
                new FoodProduct("blueberry", 1, 0.5, 10, FoodType.FRUIT)
        );

        Product[] productArray = products.toArray(new Product[]{});
        Arrays.sort(productArray, (p1, p2) -> p1.getName().compareTo(p2.getName())); // lambda comparator

        Set<Product> productSet = new TreeSet<>(new Product.ProductComparator());
        productSet.addAll(products);

        System.out.println(Arrays.equals(productArray, productSet.toArray()));
    }
}
