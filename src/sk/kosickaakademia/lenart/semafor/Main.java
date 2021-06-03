package sk.kosickaakademia.lenart.semafor;

public class Main {
    public static void main(String[] args) {
        Context context=new Context();

        RedState red=new RedState();
        OrangeState orange=new OrangeState();
        GreenState green=new GreenState();

        red.doAction(context);
        orange.doAction(context);
        green.doAction(context);
    }
}
