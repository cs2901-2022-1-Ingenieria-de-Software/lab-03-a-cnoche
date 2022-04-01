package lab.demand;
import java.util.HashMap;

public class Tax {
    
    HashMap<String, Double> cityTax = new HashMap<String, Double>();
    
    public void addTax(String country, Double tax){
        Double value = cityTax.get(country);
        if (value != null){
            return;
        }
        cityTax.put(country,tax);
    }

    public Double calculateTax(String country) {
        this.addTax("PE", 0.18);
        this.addTax("BR", 0.12);
        Double tax = cityTax.get(country);
        if (tax != null) {
            return tax;
        } else {
            return 0.0;
        }
    }

}
