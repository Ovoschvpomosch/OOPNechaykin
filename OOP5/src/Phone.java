import java.lang.String;

public class Phone {
    private int number;
    private String model;
    private double weight;

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит {" + name + "}");
    }


    public Phone(int number, String model, double weight) {
      /*  this.number = number;
        this.model = model;
        this.weight=weight;*/

        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }


    public void receiveCall(String name, int number) {
        System.out.println("Звонит {" + name + "}" + number);
    }

    public void sendMessage(int... numbers) {
        for (int number : numbers)
            System.out.print(number + " ");
    }

    public static void main(String[] args) {

        Phone Samsung =new Phone(45732299,"e1113",28);
        Phone Honor = new Phone(2442389,"A15",120);
        Phone iPhone =new Phone(988545644,"17",500);
        System.out.println("Samsung: " + Samsung.getNumber() + " " + Samsung.getModel() + " " + Samsung.getWeight() + " ");
        System.out.println("Honor: " + Honor.getNumber() + " " + Honor.getModel() + " " + Honor.getWeight() + " ");
        System.out.println("iPhone: " + iPhone.getNumber() + " " + iPhone.getModel() + " " + iPhone.getWeight() + " ");

        Samsung.receiveCall("Mom");
        Samsung.getNumber();
        Honor.receiveCall("Garlicov");
        Honor.getNumber();
        iPhone.receiveCall("Vasya");
        iPhone.getNumber();

    }
}