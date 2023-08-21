package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    void checkToStringMethod() {
        Restaurant restaurant = new Restaurant("KFC",100);
        Review review1 = new Review("Zaid","nice",4,restaurant);
        Review review2 = new Review("Zaid 1","just ok",3,restaurant);
        Review review3 = new Review("Zaid 2","bad",1,restaurant);

        String expect = "Restaurant{" +
                "name='KFC', rate=2.6666666666666665, price=100.0, " +
                "reviewList=" +
                "[Review{author='Zaid', body='nice', numberOfStars=4}," +
                " Review{author='Zaid 1', body='just ok', numberOfStars=3}," +
                " Review{author='Zaid 2', body='bad', numberOfStars=1}]}";
        assertEquals(expect , restaurant.toString());
    }
    @Test void checkLimitOfRateWithinRange(){
        String actual= null;
        try {
            Restaurant restaurant = new Restaurant("KFC",100);
            Review review1 = new Review("Zaid","nice",4,restaurant);
            Review review2 = new Review("Zaid 1","just ok",3,restaurant);
            Review review3 = new Review("Zaid 2","bad",15,restaurant);
            Review review4 = new Review("Zaid 2","bad",1,restaurant);

            System.out.println(restaurant.toString());

        }catch (Exception e){
            actual = e.getMessage();
        }
        String expect = "Not allowed number of start";
        assertEquals(actual , expect);
    }
    @Test void assure_NotChangingRate_in_Resturant_Review_association(){
        Restaurant restaurant = new Restaurant("KFC",100);
        Review review1 = new Review("Zaid","nice",4,restaurant);
        Review review2 = new Review("Zaid 1","just ok",3,restaurant);
        Review review3 = new Review("Zaid 2","bad",2,restaurant);
        Review review4 = new Review("Zaid 2","bad",1,restaurant);
        Review review5 = new Review("Zaid 2","bad",1,restaurant);

        double expected = 2.2; // 11 / 5
        double actual = restaurant.getRate(); // 10 / 4 -> dose not add review5
        assertNotEquals(expected , actual);
    }

}
