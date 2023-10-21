package shapes;

public class Point extends Shape {
    private double x=(0.0);
    private double y=(0.0);
    public Point() {
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double temp) {
        this.x = temp;
    }
    public void setY(double temp) {
        this.y = temp;
    }

    @Override
    public double getArea() {
        return (0.0);
    }

    @Override
    public double getPerimeter() {
        return (0.0);
    }

    @Override
    public void move(double moveX, double moveY) {
        this.x=x+moveX;
        this.y=y+moveY;
    }
    @Override
    public void draw() {
        System.out.println("Фигура Точка");
        System.out.println("Координаты точки: "+"x="+x+" y="+y);
        System.out.println("Цвет точки: "+getColor());
        System.out.println(" ");
    }
}