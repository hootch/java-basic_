package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.reviews = "인셉션";
        inception.title = "인셉션 타이틀";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.reviews = "꿀잼";

        System.out.println("영화 제목 : " + inception.title + " \n영화 리뷰 : " + inception.reviews);
        System.out.println("영화 제목 : " + aboutTime.title + " \n영화 리뷰 : " + aboutTime.reviews);

    }
}
