package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ReviewMethod {

    private String name;
    private String description;
    private int numberOfDollarSigns;
    private double rate;
    List<Review> reviewList = new ArrayList<>();

    public Shop(String name, String description, int numberOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }
    @Override
    public void addReview(Review review) {
        boolean isExist = false;

        for (Review review1 : getReviewList()) {
            if (review.equals(review1)) {
                isExist = true;
            }
        }

        if (!isExist) {
            getReviewList().add(review);
            int totalReviewStars = getReviewList().stream().map((review1) ->
                    review1.getNumberOfStars()).reduce(0, Integer::sum);
            setRate(((double) totalReviewStars / getReviewList().size()));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }

    public void setNumberOfDollarSigns(int numberOfDollarSigns) {
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
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

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                ", rate=" + rate +
                ", reviewList=" + reviewList +
                '}';
    }
}
