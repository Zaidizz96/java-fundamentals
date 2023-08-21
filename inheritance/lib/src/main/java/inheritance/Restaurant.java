package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant  {
    private String name;

    private double rate;

    private double price;

    private List<Review> reviewList = new ArrayList<>();

    public Restaurant(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void addReview(Review review) {
        int totalReviewStarts = 0;
        getReviewList().add(review);

        for (Review review1 : getReviewList()) {
            totalReviewStarts += review1.getNumberOfStars();
            if (!review.equals(review1)) {
                System.out.println(" ++++++++++++++++ " + totalReviewStarts + " size = " + getReviewList().size());
                System.out.println(" ++++++++++++++++ " + (totalReviewStarts/getReviewList().size()));
                setRate((totalReviewStarts/getReviewList().size()));
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        if (rate < 1 || rate > 5) {
            throw new RuntimeException("Not allowed number of start");
        }
        this.rate = rate;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", price=" + price +
                ", reviewList=" + reviewList +
                '}';
    }
}
