public class Sales {
    // each object contains details of one sale

    private String itemId;     // id of the item
    private double value;      // the price of one item
    private int quantity;      // the number of the items sold

    public Sales(String i, double v, int q) {
        this.itemId = i;
        this.value = v;
        this.quantity = q;
    }

    public double getValue() {return value;}
    public int getQuantity() {return quantity;}
}