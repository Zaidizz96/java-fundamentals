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
        boolean isExist = false;

        for (Review review1 : getReviewList()) {
            if (review.equals(review1)) {
                isExist = true;
            }
        }

        if (!isExist) {
            getReviewList().add(review);
            int totalReviewStars = getReviewList().stream().map((review1) -> review1.getNumberOfStars()).reduce(0,Integer::sum);
            setRate(((double) totalReviewStars/getReviewList().size()));
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
