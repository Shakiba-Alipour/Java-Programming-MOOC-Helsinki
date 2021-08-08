
import java.util.Objects;
 
public class LicensePlate {
    // don't modify existing parts of this class
 
    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;
 
    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }
 
    @Override
    public String toString() {
        return country + " " + liNumber;
    }
 
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        LicensePlate o = (LicensePlate) object;
        if (this.country.equals(o.country) && this.liNumber.equals(o.liNumber)) {
            return true;
        }
        return false;
    }
 
    public int hashCode() {
        if (this.country.equals(null)) {
            return Integer.valueOf(this.country);
        }
        return this.country.hashCode();
    }
}
 
