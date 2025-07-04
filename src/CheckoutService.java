public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Error: Cart is empty.");
            return;
        }

        for (CartItem item : cart.getItems()) {
            products p = item.product;

            if (p.isExpaired()) {
                System.out.println("Error: Product " + p.getName() + " is expired.");
                return;
            }

            if (item.quantity > p.getQuantity()) {
                System.out.println("Error: Product " + p.getName() + " is out of stock.");
                return;
            }
        }

        double subtotal = cart.getSubtotal();
        double shipping = ShippingService.ship(cart.getItems());
        double total = subtotal + shipping;

        if (customer.getBalance() < total) {
            System.out.println("Error: Insufficient balance.");
            return;
        }

        customer.deduct(total);
        for (CartItem item : cart.getItems()) {
            item.product.reduceQuantity(item.quantity);
        }

        System.out.println("** Checkout receipt **");

        for (CartItem item : cart.getItems()) {
            System.out.printf("%-15s %5d\n", item.quantity + "x " + item.product.getName(), (int) item.getTotalPrice());
        }

        System.out.println("----------------------");
        System.out.printf("%-15s %5d\n", "Subtotal", (int) subtotal);
        System.out.printf("%-15s %5d\n", "Shipping", (int) shipping);
        System.out.printf("%-15s %5d\n", "Amount", (int) total);
    }
}
