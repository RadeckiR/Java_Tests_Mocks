package put.io.testing.audiobooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudiobookPriceCalculatorTest {




    private Audiobook audiobook;
    @Test
    public void testcalculate1() {
         Customer customer1= new Customer("Radek1", Customer.LoyaltyLevel.STANDARD,true);
        assertEquals(customer1.isSubscriber(),true);





    }
    @Test
    public void testcalculate2() {
         Customer customer2= new Customer("Radek2", Customer.LoyaltyLevel.SILVER,false);
        assertEquals(customer2.isSubscriber(),false);


        assertEquals(customer2.getLoyaltyLevel(), Customer.LoyaltyLevel.SILVER);


    }

    @Test
    public void testcalculate3() {
         Customer customer3= new Customer("Radek3", Customer.LoyaltyLevel.GOLD,false);
        assertEquals(customer3.isSubscriber(),false);


        assertEquals(customer3.getLoyaltyLevel(), Customer.LoyaltyLevel.GOLD);


    }
    @Test
    public void testcalculate4() {
         Customer customer4= new Customer("Radek4", Customer.LoyaltyLevel.STANDARD,false);
        assertEquals(customer4.isSubscriber(),false);


        assertEquals(customer4.getLoyaltyLevel(), Customer.LoyaltyLevel.STANDARD);


    }

}