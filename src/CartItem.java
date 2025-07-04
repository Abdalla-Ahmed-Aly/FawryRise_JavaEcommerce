public class CartItem {
    products product;
    int quantity;

    public CartItem(products product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

}
