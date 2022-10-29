public class Rectangle extends Figures {
    double sideA;
    double sideB;
    public Rectangle(double lengthA, double lengthB) {
        setSides(lengthA, lengthB);
    }
    public void setSides(double lengthA, double lengthB) {
        this.sideA = lengthA;
        this.sideB = lengthB;
        if (sideB > sideA){
            sideA = sideA + sideB - (sideB = sideA);
        }
        super.perimeter = sideA * 2 + sideB * 2;
        super.area = sideA * sideB;
    }

    @Override
    public void printInfo() {
        System.out.println("Это прямоугольник:*" + "\n" + "Большая сторона = " + sideA + "\n" + "Меньшая сторона = "
                + sideB + "\n" + "Площадь = " + area + "\n" + "Периметр = " + perimeter + "\n");
    }
}

