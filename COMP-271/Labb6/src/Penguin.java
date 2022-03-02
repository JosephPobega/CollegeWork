public class Penguin extends Animal implements Walkable, Swimable{
    private double walkSpeed = 0.75;
    private double swimSpeed = 8.0;

    public Penguin(){
        super("The penguin");
    }
    @Override
    public void walk(){
        System.out.println(name + " walks at " + walkSpeed + " meters per second.");
    }
    @Override
    public void swim(){
        System.out.println(name + " swim at " + swimSpeed + " meters per second.");
    }
}
