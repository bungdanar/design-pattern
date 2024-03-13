import creational.prototype.Circle;

public class Main {
    public static void main(String[] args) {
        var circle = new Circle();
        circle.setRadius(10);

        var circle2 = (Circle) circle.clone();

        System.out.println(circle.getRadius());
        System.out.println(circle2.getRadius());
    }
}