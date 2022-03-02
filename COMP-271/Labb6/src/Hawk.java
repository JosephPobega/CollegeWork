public class Hawk extends Animal implements Walkable, Flyable{
    private double walkSpeed = 0.25;
    private double flySpeed = 12.0;

    public Hawk(){
        super("The hawk");
    }
    public void walk(){
        System.out.println(name + " walka at " + walkSpeed + " meters per second.");
    }
    @Override
    public void fly(){
        System.out.println(name + " flys at " + flySpeed + " meters per second.");
    }
    }
