package LAB.L6.Task.Scenario1;

public class Review {
    private String message;
    public float ratingValue;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Review(String message, float ratingValue) {
        this.message = message;
        this.ratingValue = ratingValue;
    }

}
