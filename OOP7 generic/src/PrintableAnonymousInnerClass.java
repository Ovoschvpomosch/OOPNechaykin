interface Printable{
    void  print();
}

public class PrintableAnonymousInnerClass {
    public static void main(String[] args){
        Printable printable=new Printable() {
            @Override
            public void print() {
                System.out.println("I am printing");
            }
            public void printInAnon() {
                System.out.println("I am printing in anonymous");
            }
        };
        printable.print();
    }
}
