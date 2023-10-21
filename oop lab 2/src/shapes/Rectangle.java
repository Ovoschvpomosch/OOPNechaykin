package shapes;

public class Rectangle extends Shape {
    private Point A;
    private Point C;
    public Rectangle() {
    }
    public Rectangle(Point point1, Point point2) {
        this.A = point1;
        this.C = point2;
    }

    public Point getFirstPoint() {
        return A;
    }
    public void setFirstPoint(Point temp) {
        this.A = temp;
    }
    public Point getSecondPoint() {
        return C;
    }
    public void setSecondPoint(Point temp) {
        this.C = temp;
    }

    private void validate(){
        if((A.getX()== C.getX())||(A.getY()==C.getY()))
        {
            System.out.println("не удалось создать фигуру, т.к. точки лежат на одной прямой");
        }
    }

    @Override
    public double getArea() {
        double S=(Math.sqrt((A.getX()-C.getX())*(A.getX()-C.getX()))* Math.sqrt((A.getY()-C.getY())*(A.getY()-C.getY())));
        return (S);
    }

    @Override
    public double getPerimeter() {
        double P=2*(Math.sqrt((A.getX()-C.getX())*(A.getX()-C.getX()))+ Math.sqrt((A.getY()-C.getY())*(A.getY()-C.getY())));
        return (P);
    }

    @Override
    public void move(double moveX, double moveY) {
        A.move(moveX, moveY);
        C.move(moveX, moveY);

       /* Point temp1= new Point(A.getX()+moveX, A.getY()+moveY);
        Point temp2= new Point(C.getX()+moveX,C.getY()+moveY);

        setFirstPoint(temp1);
        setSecondPoint(temp2);*/
    }
    @Override
    public void draw() {
        System.out.println("Фигура Прямоугольник");
        System.out.println("Координаты диагональных точек: "+"А(x="+A.getX()+" y="+A.getY()+") С(x="+C.getX()+" y="+C.getY()+")");
        System.out.println("Площадь: "+getArea());
        System.out.println("Периметр: "+getPerimeter());
        System.out.println("Цвет: "+getColor());
        System.out.println(" ");
    }
}