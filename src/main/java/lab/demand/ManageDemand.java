package lab.demand;
import java.util.HashMap;
import java.util.List;

public class ManageDemand {

    private Tax tax;

    public ManageDemand(Tax tax) {
        this.tax = tax;
    }

    public double calculateTotal(List<Order> orders){

        double taxes = 0.0;
        double quantities = 0.0;
        for (Order order : orders) {
            double tax = this.tax.calculateTax(order.getCountry());
            double temp = order.getQuantity();
            quantities += temp;
            taxes += tax;
        }

        return quantities * taxes;
    }

    public double calculateTotalForWithAdditionalByCountry(List<Order> orders, Tax tax){
        // Calculate additionals by country
        double taxes = 0.0;
        for (Order order : orders) {
            String currCountry = order.getCountry();
            if (currCountry.equals("PE")) {
                taxes += defaultAdditionalPeru;
            } else if (currCountry.equals("BR")) {
                taxes += defaultAdditionalBrazil;
            } else {
                taxes += defaultAdditionalColombia;
            }
        }
        return quantities * taxes;
    }

}
