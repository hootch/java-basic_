package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] movieReviews = new MovieReview[2];
        MovieReview inception = new MovieReview();
        inception.reviews = "인셉션";
        inception.title = "인셉션 타이틀";
        movieReviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임 타이틀";
        aboutTime.reviews = "꿀잼";
        movieReviews[1] = aboutTime;

        for (MovieReview m : movieReviews){
            System.out.println(m.title);
        }

    }
}
