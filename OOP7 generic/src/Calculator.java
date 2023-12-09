public class Calculator {

    public static <T extends Number,V extends Number> double sum(T x, V y){
        return x.doubleValue()+y.doubleValue();
    }

    public static <T extends Number,V extends Number> double substraction(T x, V y) {
        return x.doubleValue()-y.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }
    public static void main(String[] args) {

        Calculator a= new Calculator();
        System.out.println(a.sum(12,5.6));
        System.out.println(a.divide(12,0));
        System.out.println(a.multiply(10,7.4));

    }



}
