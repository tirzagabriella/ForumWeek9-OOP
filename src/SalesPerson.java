import java.util.Arrays;
import java.util.Comparator;

public class SalesPerson {
    // each object contains details of one salesperson

    private String id;
    private Sales[] salesHistory; // details of the different sales
    private int count = 0; // number of sales made

    //constructor for a new salesperson
    public SalesPerson(String id){
        this.id = id;
        this.salesHistory = new Sales[100];
    }

    // constructor for a salesperson transferred (together with their sales details) from another branch
    public SalesPerson(String id, Sales[] s, int c){
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }

    public int getCount(){
        return count;
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s){
        salesHistory[count] = s;
        count++;
    }

    public Sales getSalesHistory(int index) {
        return this.salesHistory[index];
    }

    public double calcTotalSales(){
        // calculates total sales for the salesperson
        double totalSales = 0;
        for(int i = 0; i < count; i++) {
            totalSales += this.salesHistory[i].getValue() * this.salesHistory[i].getQuantity();
        }
        return totalSales;
    }

    public Sales largestSale(){
        // calculates the sale with the largest value
        Sales highest = null;
        for(int i = 0; i < count; i++) {
            if(highest == null || highest.getValue()*highest.getQuantity() < salesHistory[i].getValue()*salesHistory[i].getQuantity()) {
                highest = salesHistory[i];
            }
        }
        return highest;
    }

}