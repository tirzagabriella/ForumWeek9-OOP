public class Driver {
    public static SalesPerson highest(SalesPerson[] sp){
        SalesPerson highestSp = null;
        System.out.println("sp length: " + sp.length);
        for(int i = 0; i < sp.length; i++) {
            if(sp[i] != null){
                if(highestSp == null || highestSp.calcTotalSales() < sp[i].calcTotalSales()) {
                    highestSp = sp[i];
                }
            }
        }
        return highestSp;
    }

    public static void addSales(SalesPerson[] salesPeople, Sales s, String id) {
        for(int i = 0; i < salesPeople.length; i++) {
            if(salesPeople[i].getId() == id) {
                salesPeople[i].setSalesHistory(s);
                break;
            }
        }
    }

    public static void main(String[] args) {
        SalesPerson[] salesPeople = new SalesPerson[100];

        salesPeople[0] = new SalesPerson("100");

        salesPeople[1] = new SalesPerson("101");

        salesPeople[2] = new SalesPerson("102");

        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));

        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));

        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));

        System.out.println(salesPeople[2].getId());

        System.out.println(salesPeople[0].getCount());

        System.out.println(salesPeople[1].getSalesHistory(0).getValue());

        System.out.println(salesPeople[0].calcTotalSales());

        // System.out.println("Highest sale for " + salesPeople[0].getId() + " is : " + salesPeople[0].largestSale().getValue()*salesPeople[0].largestSale().getQuantity());

        // System.out.println("The SalesPerson with highest sale is : " + highest(salesPeople).getId());

        // addSales(salesPeople, new Sales("A400",3000.00,10), "102");

        // System.out.println(salesPeople[2].getSalesHistory(0).getValue());
    }
}