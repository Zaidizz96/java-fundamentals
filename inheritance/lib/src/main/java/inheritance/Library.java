/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        try {
            Restaurant restaurant = new Restaurant("KFC",100);
            Review review1 = new Review("Zaid","nice",4,restaurant);
            Review review2 = new Review("Zaid 1","just ok",3,restaurant);
            Review review3 = new Review("Zaid 2","bad",1,restaurant);
            Review review4 = new Review("Zaid 2","bad",1,restaurant);

            System.out.println(restaurant.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
