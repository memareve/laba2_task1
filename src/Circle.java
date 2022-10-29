public class Circle extends Figures {
    double radius;
    double diameter;
    public Circle(double length, String param) {
        setRadiusOrDiam(length,param);
    }
    public void setRadiusOrDiam(double length, String param) {
        if (param.equalsIgnoreCase("Радиус")) {
            this.radius = length;
            this.diameter = length * 2;
        }
        else {
            this.diameter = length;
            this.radius = length/2;
        }
        super.perimeter = 2 * radius * Math.PI;
        super.area = radius * radius * Math.PI;


    }

    @Override
    public void printInfo() {
        System.out.println("Это круг:)" + "\n" + "Радиус = " +  radius + "\n" + "Диаметр = " + diameter + "\n"
                + "Площадь = " + area + "\n" + "Периметр = " + perimeter + "\n");
    }


}
