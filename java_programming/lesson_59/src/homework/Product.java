package homework;

public class Product {
    private String title;
    private double rating;
    private double price;
    private String category;

    public Product(String title, double rating, double price, String category) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
