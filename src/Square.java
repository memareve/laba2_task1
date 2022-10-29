public class Square extends Figures{
    double side;
    public Square(double length) {
        setSide(length);
    }
    public void setSide(double length) {
        this.side = length;
        super.perimeter = side * 4;
        super.area = side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Это квадрат:(" + "\n" + "Сторона = " + side + "\n"
                + "Площадь = " + area + "\n" + "Периметр = " + perimeter + "\n");
    }
}
