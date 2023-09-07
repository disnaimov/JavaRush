package lesson45;
public class Circle {
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public void setCenterX(int centerX){
        this.centerX = centerX;
    }

    public void setCenterY(int centerY){
        this.centerY = centerY;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getCenterX(){
        return centerX;
    }

    public int getCenterY(){
        return centerY;
    }

    public int getRadius(){
        return radius;
    }

    public int getWidth(){
        return width;
    }

    public  String getColor(){
        return color;
    }

    public void initialize(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void initialize(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centerX, int centerY, int radius, int width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }


}
