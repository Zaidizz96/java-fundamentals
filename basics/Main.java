import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

     public static void main(String[] args) {
        int dogCount = 1;
        int catCount = 2;
        System.out.println("I own" + " " + dogCount + " " + pluralize("dog", dogCount) + ".");
        System.out.println("I own" + " " + catCount + " " + pluralize("cat", catCount) + ".");
        flipNHeads(5);
        clock();
    }

    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            return word + "s";
        } else {
            return word;
        }
    }

    public static void flipNHeads(int n) {
        int heads = 0;
        for (int i = 0; i <= n; i++) {
            double random = Math.random() * 1;
            if (random < 0.5) {
                System.out.println("tails");
            } else if (random > 0.5) {
                heads += 1;
                System.out.println("heads");
            }
        }
        System.out.println("It took" + " " + n + " " + "flips to flip" + " " + heads + " " + "head in a row.");
    }

    public static void clock() {
        LocalDateTime localDateTime = LocalDateTime.now();//11:20:30
        int second = localDateTime.getSecond();
    
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try {
            while (true) {
                LocalDateTime current = LocalDateTime.now();//11:20:31
                 
                if (current.getSecond() != second) {
                    String time = current.format(formatter);
                    System.out.println(time);
                }
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
}