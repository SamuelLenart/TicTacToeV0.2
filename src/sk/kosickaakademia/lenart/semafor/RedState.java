package sk.kosickaakademia.lenart.semafor;

public class RedState implements State{
    public void doAction(Context context){
        System.out.println("The traffic lights have changed color to red");
        context.setState(this);
    }
    public String toString(){
        return "Red color";
    }
}
