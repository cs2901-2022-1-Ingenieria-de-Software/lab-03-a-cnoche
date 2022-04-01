package lab.demand;
import java.util.HashMap;
import java.util.List;

public class ManageDemand {

    private Tax tax;

    public ManageDemand(Tax tax) {
        this.tax = tax;
    }

    public Double calculateTotal(List<Order> orders){

        Double taxes = 0.0;
        Double quantities = 0.0;
        for (Order order : orders) {
            Double tax1 = this.tax.calculateTax(order.getCountry());
            Long temp = order.getQuantity();
            quantities += temp;
            taxes += tax1;
        }
        return quantities * taxes;
    }

    public Double calculateTotalForWithAdditionalByCountry(List<Order> orders, Tax tax){
        // Calculate additionals by country
        Double taxes = 0.0;
        Long quantities = 0L;
        for (Order order : orders) {
            taxes += this.tax.calculateTax(order.getCountry());
            quantities += order.getQuantity();
        }

        return quantities * taxes;
    }
}
