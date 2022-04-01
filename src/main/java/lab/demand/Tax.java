package lab.demand;
import java.util.HashMap;

public class Tax {
    
    HashMap<String, Double> cityTax = new HashMap<String, Double>();
    
    public Double addTax(String country, Double tax){
        cityTax.put(country,tax);
        return value;
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
