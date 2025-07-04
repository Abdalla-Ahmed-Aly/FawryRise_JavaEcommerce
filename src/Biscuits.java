public class Biscuits extends products implements Shippable {
    private boolean expired;
    private double weight;

    public Biscuits(String name, double price, int quantity, boolean expired, double weight) {
        super(name, price, quantity);
        this.expired = expired;
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public boolean isExpaired() {
        return expired;
    }

  
    
}
