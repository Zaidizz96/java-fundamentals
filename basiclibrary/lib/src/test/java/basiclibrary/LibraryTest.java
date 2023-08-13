/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test
    void testRoll() {
        int n = 5;
        int[] result = Library.roll(n);

        assertEquals(n, result.length, "Incorrect array length");

        for (int value : result) {
            assertTrue(value >= 0 && value <= 6, "Value out of range: " + value);
        }

    }

    @Test
    void testContainsDuplicatesWithDuplicates() {
        int[] arrWithDuplicates = {1, 2, 3, 4, 5, 2};
        assertTrue(Library.containsDuplicates(arrWithDuplicates), "Array contains duplicates");
    }
    @Test
    void testContainsDuplicatesWithoutDuplicates() {
        int[] arrWithoutDuplicates = {1, 2, 3, 4, 5};
        assertFalse(Library.containsDuplicates(arrWithoutDuplicates), "Array doesn't contain duplicates");
    }
    @Test
    void testCalculatingAverages() {
        int[] arr = {10, 20, 30, 40, 50};
        int expectedAverage = 30; // (10 + 20 + 30 + 40 + 50) / 5 = 30

        int calculatedAverage = Library.calculatingAverages(arr);
        assertEquals(expectedAverage, calculatedAverage, "Average calculation is incorrect");
    }
    @Test
    void testFindLowestAverageIndex() {
        int[][] arrays = {
                {10, 20, 30},
                {5, 15, 25},
                {8, 16, 24}
        };
        int expectedIndex = 1; // The second array has the lowest average

        int calculatedIndex = Library.findLowestAverageIndex(arrays);
        assertEquals(expectedIndex, calculatedIndex, "Incorrect index with lowest average");
    }

    @Test
    void testCalculateAverage() {
        int[] array = {10, 20, 30};
        double expectedAverage = 20.0;

        double calculatedAverage = Library.calculateAverage(array);
        assertEquals(expectedAverage, calculatedAverage, 0.001, "Average calculation is incorrect");
    }

    @Test
    void testAnalyseWeatherSingleDay(){
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        Set<Integer> temp = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        // fill hash set from array to be unique
        for (int[] numArr : weeklyMonthTemperatures) {
            for (int i = 0; i < numArr.length; i++) {
                temp.add(numArr[i]);
            }
        }
        // remove duplicate
        list.addAll(temp);
        // sort list
        Collections.sort(list);

        int maxTemp = Collections.max(list);
        int minTemp = Collections.min(list);

        int expectedMaxTemp = 72;
        int expectedMinTemp = 51;
        List<Integer> expectedMissingNum = new ArrayList<>();
        expectedMissingNum.add(63);
        expectedMissingNum.add(67);
        expectedMissingNum.add(68);
        expectedMissingNum.add(69);

        List<Integer> result = Library.getMissingNum(list, minTemp, maxTemp);
        assertEquals(expectedMaxTemp , maxTemp);
        assertEquals(expectedMinTemp , minTemp);
        assertEquals(expectedMissingNum , result);
    }

    @Test
    void testTallyingElection(){
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        Collections.sort(votes);

        String expectedTally = "Bush";
        String result = Library.tally(votes);
        assertEquals(expectedTally , result);
    }
}
