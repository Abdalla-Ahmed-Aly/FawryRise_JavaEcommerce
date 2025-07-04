import java.util.List;

public class ShippingService {
    public static double ship(List<CartItem> cartItems) {
        double totalWeight = 0;

        System.out.println("** Shipment notice **");

        for (CartItem item : cartItems) {
            if (item.product instanceof Shippable) {
                Shippable product = (Shippable) item.product;
                String name = product.getName();
                double weightPerUnit = product.getWeight();
                int quantity = item.quantity;
                int totalGrams = (int) (weightPerUnit * 1000 * quantity);

                System.out.printf("%-15s %5s\n", quantity + "x " + name, totalGrams + "g");

                totalWeight += weightPerUnit * quantity;
            }
        }

        System.out.printf("Total package weight %.1fkg\n\n", totalWeight);
        return totalWeight * 28;
    }
}
