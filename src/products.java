public abstract class products  {
    protected String Name;
    protected Double Price;
    protected int quantity;

    public products(String name, Double price, int quantity) {
        Name = name;
        Price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            System.out.println("Not enough quantity available.");
        }
    }

    public abstract boolean isExpaired();

}
