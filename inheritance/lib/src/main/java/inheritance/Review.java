package inheritance;

import java.util.Objects;

public class Review {
    private String author;
    private String body;
    private Integer numberOfStars = 0;

    private Restaurant restaurant;

    public Review(String author, String body, Integer numberOfStars, Restaurant restaurant) {
        this.author = author;
        this.body = body;
        this.numberOfStars = numberOfStars;
        this.restaurant = restaurant;
        restaurant.addReview(this);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(Integer numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(author, review.author) &&
                Objects.equals(body, review.body) &&
                Objects.equals(numberOfStars, review.numberOfStars) &&
                Objects.equals(restaurant, review.restaurant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, body, numberOfStars, restaurant);
    }

    @Override
    public String toString() {
        return "Review{" +
                "author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", numberOfStars=" + numberOfStars +
                '}';
    }
}
