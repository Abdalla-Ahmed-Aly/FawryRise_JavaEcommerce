public class MobileScratchCard extends products {
    public MobileScratchCard(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public boolean isExpaired() {
        return false;
    }
}
