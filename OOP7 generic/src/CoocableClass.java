interface Coocable {
        void cooc(String str);
    }
    class Food{
        public void prepare(Coocable c, String str)
        { c.cooc(str);}
        public static void main (String[] args){
            Food dish=new Food();
            Coocable c= new Coocable() {
                @Override
                public void cooc(String str) {
                    System.out.println("Coocing "+ str);
                }
            };
            dish.prepare(c, "ready");
        }
    }
    public class CoocableClass {}
