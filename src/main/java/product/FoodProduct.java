package product;
public class FoodProduct extends Product {

    public static int PRINT_COUNT = 0;

    private int calories;
    private FoodType foodType;
    public FoodProduct() {
        super("Something", 0,  0);
        this.calories = 0;
        this.foodType = FoodType.UNKNOWN;
    }

    public FoodProduct(String name, int quantity, double price, int calories, FoodType foodType) {
        super(name,quantity, price);
        this.calories = calories;
        this.foodType = foodType;
    }

    public static void print(String name, int quantity, double price, int calories, FoodType foodType) {
        System.out.println(new FoodProduct(name, quantity, price, calories, foodType));
        PRINT_COUNT++;
    }

    public static void printCount() {
        System.out.println("FoodProduct.Product print count: " + PRINT_COUNT);
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public int getCalories() {
        return calories * quantity;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return "FoodProduct.Product: name=" + name + ", price=" + (quantity * price) +
                ", calories=" + (quantity * calories) + " Food Type=" + foodType;
    }
}
