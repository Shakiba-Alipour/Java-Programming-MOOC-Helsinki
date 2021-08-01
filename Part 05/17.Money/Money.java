 
public class Money {
 
    private final int euros;
    private final int cents;
 
    public Money(int euros, int cents) {
 
        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }
 
        this.euros = euros;
        this.cents = cents;
    }
 
    public int euros() {
        return this.euros;
    }
 
    public int cents() {
        return this.cents;
    }
 
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }
 
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }
        if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }
        return false;
    }
 
    public Money minus(Money decreaser) {
        int money1 = this.euros * 100 + this.cents;
        int money2 = decreaser.euros * 100 + decreaser.cents;
        int d = money1 - money2;
        if (d < 0) {
            d = 0;
        }
        Money newMoney = new Money(0, d);
        return newMoney;
    }
 
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }
 
        return this.euros + "." + zero + this.cents + "e";
    }
 
}
 
