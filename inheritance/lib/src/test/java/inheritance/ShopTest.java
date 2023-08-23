package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {

    @Test void checkConstructor_and_ToString_Functionality(){
        Shop shop = new Shop("amazon" , "collection stuffs" , 7);
        Review review = new Review("zaid" , "very good services" , 3 , shop);
        Review review1 = new Review("raed" , "not bad" , 4 , shop);
        Review review2 = new Review("subhi" , "excellent!" , 5 , shop);
        Review review3 = new Review("fouad" , "very good services" , 4 , shop);

        String expected = "Shop{name='amazon', description='collection stuffs', numberOfDollarSigns=7, rate=4.0" +
                ", reviewList=[Review{author='zaid', body='very good services'" +
                ", numberOfStars=3}, Review{author='raed', body='not bad'" +
                ", numberOfStars=4}, Review{author='subhi', body='excellent!'" +
                ", numberOfStars=5}, Review{author='fouad', body='very good services'," +
                " numberOfStars=4}]}";
        String actual = shop.toString();
        assertEquals(actual , expected);
    }

    // The testing methods for shop same as resturant
}
