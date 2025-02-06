package oop1.ex;

public class Rectangle {
    int width;
    int height;
    int area;


    void init(int width, int height){
        this.height = height;
        this.width = width;
        this.area = height * width;
    }

    void showArea(){
        System.out.println(area);
    }

    void showPerimeter(){
        System.out.println((width + height) * 2);
    }

    void isSquare(){
        if (width == height) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
