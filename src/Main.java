public class Main {
    public static void main(String[] args) {
        products cheese = new Cheese("Cheese", 100, 5, false, 0.2);
        products biscuits = new Biscuits("Biscuits", 150, 3, false, 0.7);
        products tv = new TV("TV", 500, 3, 5);
        products scratchCard = new MobileScratchCard("ScratchCard", 50, 10);

        Customer customer = new Customer("Abdullah", 5000);

        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        // cart.add(tv, 3);
        // cart.add(scratchCard, 1);
        CheckoutService.checkout(customer, cart);

    }
}
