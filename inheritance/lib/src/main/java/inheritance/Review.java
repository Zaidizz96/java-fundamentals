package inheritance;

import java.util.Objects;

public  class Review {

    private String author;
    private String body;
    private Integer numberOfStars = 0;
    private Restaurant restaurant;
    private Shop shop;

    private Theater theater;
    private String movie;

    public Review(String author, String body, Integer numberOfStars, Restaurant restaurant) {
        this.author = author;
        this.body = body;
        this.numberOfStars = numberOfStars;
        this.restaurant = restaurant;
        restaurant.addReview(this);
    }

    public Review(String author, String body, Integer numberOfStars , Shop shop) {
        this.author = author;
        this.body = body;
        this.numberOfStars = numberOfStars;
        this.shop = shop;
        shop.addReview(this);
    }

    public Review(String author, String body, Integer numberOfStars, String movie , Theater theater) {
        this.author = author;
        this.body = body;
        this.numberOfStars = numberOfStars;
        this.movie = movie;
        this.theater = theater;
        theater.addReview(this);
    }
    public Review(String author, String body, Integer numberOfStars, Theater theater) {
        this.author = author;
        this.body = body;
        this.numberOfStars = numberOfStars;
        this.theater = theater;
        theater.addReview(this);
    }

    public String getAuthor() {
        return author;
    }

    public String getBody() {
        return body;
    }

    public Integer getNumberOfStars() {
        return numberOfStars;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Review review = (Review) o;
        return Objects.equals(author, review.author) &&
                Objects.equals(body, review.body) &&
                Objects.equals(numberOfStars, review.numberOfStars) &&
                Objects.equals(restaurant, review.restaurant) &&
                Objects.equals(shop , review.shop) &&
                Objects.equals(theater , review.theater);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, body, numberOfStars, restaurant , shop , theater);
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

