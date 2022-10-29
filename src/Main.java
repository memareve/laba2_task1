public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(10,"диаметр");
        Square square = new Square(5);
        Rectangle rect = new Rectangle(5,10);
        circle.printInfo();
        square.printInfo();
        rect.printInfo();

        circle.setRadiusOrDiam(2, "радиус");

        circle.printInfo();

    }
}
