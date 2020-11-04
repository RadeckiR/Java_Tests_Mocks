#komentarz zadanie 6

import java.math.BigDecimal;
import java.time.LocalTime;
#pierwsza zmiana
public class Drink extends Product{
     Drink(int id, String name, BigDecimal price, Rating rating) {
        super(id, name, price, rating);
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Drink(getId(), getName(),getPrice(),newRating);
    }
#druga zmiana
    @Override
    public BigDecimal getDiscount() {
        if ( LocalTime.now().isBefore(LocalTime.of(17,30)) && LocalTime.now().isAfter(LocalTime.of(17,30))){
            return super.getDiscount();
        }
        else{
            return BigDecimal.ZERO;
        }

    }
}
#trzecia zmiana


SHOWEKhmm