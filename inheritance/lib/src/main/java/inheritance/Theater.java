package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements ReviewMethod {
    private String name;
    private double rate;
    private List<Review> reviewList = new ArrayList<>();
    private List<String> moviesShown = new ArrayList<>();

    public Theater(String name) {
        this.name = name;

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
    public void addMovie(String movieName) {

        for ( String name : moviesShown ) {
            if(movieName.equals(name)){
                return;
            }
        }
        this.moviesShown.add(movieName);
    }

    public void removeMovie(String movieName) {
            this.moviesShown.remove(movieName);
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public List<String> getMoviesShown() {
        return moviesShown;
    }
    public void setMoviesShown(List<String> moviesShown) {
        this.moviesShown = moviesShown;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", reviewList=" + reviewList +
                ", moviesShown=" + moviesShown+
                '}';
    }
}
