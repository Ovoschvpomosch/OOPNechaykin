package shapes;

public class Triangle extends Shape  {
    private Point A;
    private Point B;
    private Point C;

    public Triangle() {
    }
    public Triangle(Point point1, Point point2, Point point3) {
        this.A = point1;
        this.B = point2;
        this.C = point3;
    }
    public Point getA() {
        return A;
    }
    public void setA(Point temp) {
        this.A = temp;
    }

    public Point getB() {
        return B;
    }
    public void setB(Point temp) {
        this.B = temp;
    }

    public Point getC() {
        return C;
    }
    public void setC(Point temp) {
        this.C = temp;
    }

    private void validate(){
        if ((C.getX() - A.getX()) / (B.getX() - A.getX()) == (C.getY()- A.getY()) / (B.getY() - A.getY()))
        {
            System.out.println("не удалось создать фигуру");

        }
    }

    private double findLenghtOf(Point A, Point B)
    {
        double AB=Math.sqrt((A.getX()-B.getX())*(A.getX()-B.getX())+(A.getY()-B.getY())*(A.getY()-B.getY()));
        return AB;
    }

    @Override
    public double getArea() {
        double AB=findLenghtOf(A,B);
        double BC=findLenghtOf(B,C);
        double AC=findLenghtOf(A,C);

        double  p=getPerimeter()/2;
        double S=Math.sqrt(p*(p-AC)*(p-AB)*(p-BC));
        return (S);
    }

    @Override
    public double getPerimeter() {
        double AB=findLenghtOf(A,B);
        double BC=findLenghtOf(B,C);
        double AC=findLenghtOf(A,C);

        double P=AB+AC+BC;
        return (P);
    }

    @Override
    public void move(double moveX, double moveY) {
        A.move(moveX, moveY);
        B.move(moveX, moveY);
        C.move(moveX, moveY);
    }
    @Override
    public void draw() {
        System.out.println("Фигура Треугольник");
        System.out.println("Координаты точек: "+"А(x="+A.getX()+" y="+A.getY()+") B("+B.getX()+" y="+B.getY()+") С(x="+C.getX()+" y="+C.getY()+")");
        System.out.println("Площадь: "+getArea());
        System.out.println("Периметр: "+getPerimeter());
        System.out.println("Цвет: "+getColor());
        System.out.println(" ");
    }
}