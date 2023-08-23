package inheritance;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TheaterTest {

    @Test void checkConstructor_ToString_and_PossibiltyToAdd_Movie_Name_Functionality(){
        Theater theater = new Theater("Taj Mall");
            Review review1 = new Review("mohammad" , "amazing" , 4  , "the witcher" , theater);
            Review review2 = new Review("khaled" , "not bad" , 3 , theater);
            Review review3 = new Review("raed" , "nice" , 5 , theater);
            Review review4 = new Review("zaid" , "amazing" , 1 , "Batman" , theater);

            String expected = "Theater{name='Taj Mall', rate=3.25" +
                    ", reviewList=[Review{author='mohammad', body='amazing', numberOfStars=4}" +
                    ", Review{author='khaled', body='not bad', numberOfStars=3}" +
                    ", Review{author='raed', body='nice', numberOfStars=5}" +
                    ", Review{author='zaid', body='amazing', numberOfStars=1}], moviesShown=[]}";
            String actual = theater.toString();
            assertEquals(expected , actual);
    }
}
