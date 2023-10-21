package shapes;

public class Circle extends Shape{
    private Point point;
    private double radius;

    public Circle() {
    }
    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }
    public Point getPoint() {
        return point;
    }
    public double getRadius() {
        return radius;
    }
    public void setPoint(Point temp) {
        this.point = temp;
    }
    public void setRadius(double temp) {
        this.radius = temp;
    }

    private void validate(){
        if(radius<=0)
        {
            System.out.println("не удалось создать фигуру");
        }
    }

    @Override
    public double getArea() {
        double S=3.1415*radius*radius;
        return (S);
    }

    @Override
    public double getPerimeter() {
        double P=3.1415*2*radius;
        return (P);
    }

    @Override
    public void move(double moveX, double moveY) {
        point.move(moveX, moveY);
    }
    @Override
    public void draw() {
        System.out.println("Фигура Круг");
        System.out.println("Координаты центра: "+"x="+point.getX()+" y="+point.getY());
        System.out.println("Радиус круга: "+radius);
        System.out.println("Площадь круга: "+getArea());
        System.out.println("Периметр круга: "+getPerimeter());
        System.out.println("Цвет круга: "+getColor());
        System.out.println(" ");
    }
}