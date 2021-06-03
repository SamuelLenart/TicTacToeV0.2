package sk.kosickaakademia.lenart.semafor;

public class OrangeState implements State{
    public void doAction(Context context){
        System.out.println("The traffic lights have changed color to orange");
        context.setState(this);
    }
    public String toString(){
        return "Orange color";
    }
}
