public class Bat extends Animal implements Flyable{
    private double flySpeed = 10.0;

    public Bat(){
        super("The bat");
    }
    public void fly(){
        System.out.println(name + " flys at " + flySpeed + " meters per second.");
    }
}