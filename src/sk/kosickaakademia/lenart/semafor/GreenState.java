package sk.kosickaakademia.lenart.semafor;


public class GreenState implements State{
    public void doAction(Context context){
        System.out.println("The traffic lights have changed color to green");
        context.setState(this);
    }
    public String toString(){
        return "Green color";
    }
}
